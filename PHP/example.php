<?php
require(__DIR__ . "/../../partials/nav.php");

if (!has_role("Admin")) {
    flash("You don't have permission to view this page", "warning");
    redirect("home.php");
    //die(header("Location: " . get_url("home.php")));
}
$columns = get_columns("Products");

$ignore = ["id", "modified", "created", "averageRating"];

//update the item
if (isset($_POST["submit"])) {
    $id = save_data("Products", $_POST);
    if ($id > 0) {
        flash("Created Item with id $id", "success");
    }
}
function mapColumn($col)
{
    global $columns;
    foreach ($columns as $c) {
        if ($c["Field"] === $col) {
            return inputMap($c["Type"]);
        }
    }
    return "text";
}

$results = [];
$db = getDB();
//Sort and Filters

$stockAmount = se($_GET, "stockAmount", "", false);
error_log("stock value here: " . $stockAmount);

$category = se($_GET, "category", "", false);
error_log("category value here: " . $category);

//$col = se($_GET, "col", "unit_price", false);
//allowed list
/*if (!in_array($col, ["unit_price", "category", "stock", "name"])) {
    $col = "unit_price"; //default value, prevent sql injection
}*/

$order = se($_GET, "order", "asc", false);
//allowed list
if (!in_array($order, ["asc", "desc"])) {
    $order = "asc"; //default value, prevent sql injection
}


$name = se($_GET, "name", "", false);
//$category = se($GET, "category", "", false);

//split query into data and total
$base_query = "SELECT * FROM Products";
$total_query = "SELECT count(1) as total FROM Products";
//dynamic query
$query = " WHERE 1=1 "; //1=1 shortcut to conditionally build AND clauses LIMIT 10"
$params = []; //define default params, add keys as needed and pass to execute
//apply name filter
if (!empty($name)) {
    $query .= " AND Products.name like :name";
    $params[':name'] = "%$name%";
}

if ($stockAmount <= 0 && $stockAmount != "") {
    $query .= " AND Products.stock <= :stock";
    $params[':stock'] = "$stockAmount";
} /*
if (!empty($stockAmount)) {
    $query .= " AND Products.stock in (SELECT DISTINCT Products.stock FROM Products WHERE Products.stock = :stock)";
    $params[":stock"] = "$stockAmount";
} */

if (!empty($category)) {
    $query .= " AND Products.category = :category";
    $params[':category'] = "$category";
}

//apply column and order sort WHERE stock > 0 LIMIT 10
if (!empty($order)) { //!empty($col) && 
    $query .= " ORDER BY unit_price $order"; // $col be sure you trust these values, I validate via the in_array checks above
}


//paginate function
$per_page = 10;
paginate($total_query . $query, $params, $per_page);
//get the total
//this comment block has been replaced by paginate()

$query .= " LIMIT :offset, :count";
$params[":offset"] = $offset;
$params[":count"] = $per_page;
//get the records
$stmt = $db->prepare($base_query . $query); //dynamically generated query
//error_log("Final statement here" . $stmt);
//we'll want to convert this to use bindValue so ensure they're integers so lets map our array
foreach ($params as $key => $value) {
    $type = is_int($value) ? PDO::PARAM_INT : PDO::PARAM_STR;
    $stmt->bindValue($key, $value, $type);
}
$params = null; //set it to null to avoid issues


//$stmt = $db->prepare("SELECT id, name, description, cost, stock, image FROM BGD_Items WHERE stock > 0 LIMIT 50");
try {

    $stmt->execute($params); //dynamically populated params to bind
    $r = $stmt->fetchAll(PDO::FETCH_ASSOC);
    if ($r) {
        $results = $r;
        //error_log("results here" . $results);
    }
} catch (PDOException $e) {
    flash("<pre>" . var_export($e, true) . "</pre>");
}

?>


<div class="jumbotron">
    <div class="container text-center">
        <img src="/images/Dinfluence600x600.png" alt="Icon" style="width:300px;height:300px;">
        <div class="same_font">
            <h2>Our Shop</h2>
            <span>ADMIN PAGE</span>
        </div>
    </div>
</div>

<div class="margin"></div>
<div class="container">
    <div class="same_font">
        <form class="align-items-center">
            <!--<div class="input-group mb-4">-->
            <div class="col">
                <div class="input-group">
                    <div class="input-group-text">NAME</div>
                    <input class="form-control" name="name" value="<?php se($name); ?>" />
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="input-group">
                        <div class="input-group-text">CATEGORY</div>
                        <select class="form-control" name="category" value="<?php se($category); ?>">
                            <option id="category" name="category" value="">NO OPTION</option>
                            <option id="category" name="category" value="Art">ART</option>
                            <option id="category" name="category" value="Shoes">SHOES</option>
                            <option id="category" name="category" value="Clothes">CLOTHES</option>
                        </select>
                        <script>
                            //quick fix to ensure proper value is selected since
                            //value setting only works after the options are defined and php has the value set prior
                            document.forms[0].category.value = "<?php se($category); ?>";
                        </script>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="input-group">
                        <div class="input-group-text">OUT OF STOCK</div>
                        <select class="form-control" name="stockAmount" value="<?php se($stockAmount); ?>">
                            <option value="">NO OPTION</option>
                            <option value="0">OUT OF STOCK</option>
                        </select>
                        <script>
                            document.forms[0].stockAmount.value = "<?php se($stockAmount); ?>";
                        </script>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="input-group">
                    <div class="input-group-text">PRICE SORT</div>
                    <select class="form-control" name="order" value="<?php se($order); ?>">
                        <option value="asc">ASCENDING</option>
                        <option value="desc">DESCENDING</option>
                    </select>
                    <script>
                        //quick fix to ensure proper value is selected since
                        //value setting only works after the options are defined and php has the value set prior
                        document.forms[0].order.value = "<?php se($order); ?>";
                    </script>
                </div>
            </div>
            <br>
            <div class="col">
                <div class="input-group">
                    <input type="submit" class="btn btn-dark" value="Apply" />
                </div>
            </div>
        </form>
    </div>
</div>


<div class="container-fluid">
    <div class="row text-center py-5">
        <div class="row row-cols-2 row-cols-md-5 g-2">
            <?php
            $counter = 0;
            foreach ($results as $item) : ?>
                <div class="col">
                    <div class="card bg-white">

                        <?php if (se($item, "image", "", false)) :
                            $file_name = (string) $item["image"]; ?>

                            <img id="img<?php echo ($counter) ?>" src="test" class="card-img-top" alt="..." />
                            <script>
                                // ?= $file_name?> calls the php variable to be manipulated
                                showimage('<?= $file_name ?>', <?= $counter ?>);
                                <?= $counter++ ?>
                            </script>

                            <?php
                            // <img src="<?php echo get_url(se($item, 'image', 'images/somedefault.jpg', false)); ?  " class="card-img-top" alt="...">
                            ?>
                        <?php endif; ?>

                        <div class="card-body">
                            <h5><?php se($item, "name"); //header name of each article  width="320" height="300"
                                ?></h5>
                            <?php if (se($item, "averageRating", "", false)) : ?>
                                <?php
                                $rating_int = (int) $item["averageRating"];
                                $rating_float = (float) $item["averageRating"];

                                for ($i = 0; $i < $rating_int; $i++) : ?>
                                    <i class='fas fa-star' style='color: #f3da35'></i>
                                <?php endfor; ?>
                                <?php if (($rating_float > $rating_int)) : ?>
                                    <i class='fa fa-star-half' style='color: #f3da35'></i>
                                <?php endif; ?>
                                <!-- <i class="far fa-star"></i>
                                   <i class="fas fa-star"></i>
                                    <i class="fas fa-star"></i>
                                -->
                            <?php endif; ?>
                            <p class="card-text">Description: <br> <?php se($item, "description"); ?></p>
                            <p class="card-text">Art story:<br> <?php se($item, "detailed_description"); ?></p>
                            <p class="card-text">Quantity: <?php se($item, "stock"); ?></p>
                            <p class="card-text">Visibility: <?php se($item, "visibility"); ?></p>


                        </div>
                        <h5>
                            <span class="price"> $<?php se($item, "unit_price"); ?></span>
                        </h5>
                        <td>
                            <a href="edit_item.php?id=<?php se($item, "id"); ?>" class="btn btn-dark">EDIT</a>
                        </td>
                        <td>
                            <a href="deleteItem.php?id=<?php se($item, "id"); ?>" class="btn btn-danger">DELETE</a>

                        </td>
                    </div>
                </div>
            <?php endforeach; ?>
        </div>
    </div>
</div>
<br>
<div>
    <?php include(__DIR__ . "/../partials/pagination.php"); ?>
</div>

<script>
    function upload(event) {
        event.preventDefault();
        let files = event.target.fileToUpload.files;
        for (let i = 0; i < files.length; i++) {
            let file = files[i];
            console.log(file);
            storage.ref().child("images/" + file.name).put(file).then(res => {
                //console.log(res);
                res.ref.getDownloadURL().then((downloadURL) => {
                    //console.log('File available at', downloadURL);
                    //this is the url you'd save in the database
                    //console.log('File available at', downloadURL);
                    //document.getElementById("dest").src = downloadURL;
                    let img = document.createElement("img");
                    img.src = downloadURL;
                    img.style.width = "300px";
                    img.style.height = "200px";
                    document.getElementById("preview").appendChild(img);
                });
                //alert(JSON.stringify(res));
            }).catch(err => {
                console.log(err);
                //alert(JSON.stringify(err));
            })
        }
    }
</script>



<div class="container">
    <form method="post" onsubmit="upload(event); return false;" enctype="multipart/form-data">
        <div>
            Select image(s) to upload:
        </div>
        <div>
            <input type="file" name="fileToUpload[]" id="fileToUpload" multiple>
        </div>
        <div>
            <input type="submit" value="Upload Image(s)" name="submit" class="btn btn-dark">
        </div>
    </form>
    <div id="preview">
    </div>
</div>

<br>
<br>
<br>

<?php
// If upload button is clicked ...
if (isset($_POST['upload'])) {

    $filename = $_FILES["uploadfile"]["name"];
    $tempname = $_FILES["uploadfile"]["tmp_name"];
    $folder = "../../public_html/images" . $filename;

    //$db = mysqli_connect("localhost", "root", "", "geeksforgeeks"); IF NOT EXISTS ( SELECT 1 FROM image WHERE filename = :filename) BEGIN 
    $checksql = "INSERT INTO image (filename) VALUES (:filename)";
    $stmt = $db->prepare($checksql);
    try {
        $stmt->execute([":filename" => $filename]);
    } catch (PDOException $e) {
        flash("<pre>" . var_export($e, true) . "</pre>");
    }
    if (move_uploaded_file($tempname, $folder)) {
        flash("Image uploaded successfully!", "warning");
    } else {
        flash("Failed to upload image!", "warning");
    }
}
?>
<script src="https://cdn.tiny.cloud/1/y2herfj2u3tn31ekosk9gjnzgmn4e82dqkt04zjsx1l0p7ce/tinymce/6/tinymce.min.js" referrerpolicy="origin"></script>

<div class="margin">
    <div class="same_font">
        <div class="wrapper_admin">
            <div class="container">
                <h1>Add Product</h1>
                <form method="POST">
                    <?php //foreach ($columns as $index => $column) : 
                    ?>
                    <?php foreach ($columns as $column => $value) : ?>
                        <?php if (!in_array($column, $ignore)) : ?>
                            <div class="mb-4">
                                <label class="form-label" for="<?php se($column); ?>"><?php se($column); ?></label>
                                <input class="form-control" id="<?php se($column); ?>" type="<?php echo mapColumn($column); ?>" value="<?php se($value); ?>" name="<?php se($column); ?>" />
                            </div>
                        <?php endif; ?>
                    <?php endforeach; ?>
                    <input class="btn btn-dark" type="submit" value="Create" name="submit" />
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    tinymce.init({
        selector: 'textarea',
        plugins: 'anchor autolink charmap codesample emoticons image link lists media searchreplace table visualblocks wordcount checklist mediaembed casechange export formatpainter pageembed linkchecker a11ychecker tinymcespellchecker permanentpen powerpaste advtable advcode editimage tinycomments tableofcontents footnotes mergetags autocorrect typography inlinecss',
        toolbar: 'undo redo | blocks fontfamily fontsize | bold italic underline strikethrough | link image media table mergetags | addcomment showcomments | spellcheckdialog a11ycheck typography | align lineheight | checklist numlist bullist indent outdent | emoticons charmap | removeformat',
        tinycomments_mode: 'embedded',
        tinycomments_author: 'Author name',
        mergetags_list: [{
                value: 'First.Name',
                title: 'First Name'
            },
            {
                value: 'Email',
                title: 'Email'
            },
        ]
    });
</script>

<?php
require_once(__DIR__ . "/../../partials/footer.php");
?>


<!--
<div class="margin">
    <div class="container">
        <form method="POST" action="" enctype="multipart/form-data">
            <input type="file" name="uploadfile" class="btn btn-white">
            <button class="btn btn-dark" type="submit" name="upload">UPLOAD</button>
        </form>
    </div>
</div>

//echo "<pre>" . var_export($columns, true) . "</pre>";

/*

$results = [];
$db = getDB();
$stmt = $db->prepare("SELECT * FROM Products WHERE (visibility = TRUE OR visibility = FALSE) AND stock > 0 LIMIT 10");
//$stmt = $db->prepare("SELECT id, name, description, unit_price, stock, image FROM Products WHERE stock > 0 LIMIT 8 AND ");
try {
    $stmt->execute();
    $r = $stmt->fetchAll(PDO::FETCH_ASSOC);
    if ($r) {
        $results = $r;
    }
} catch (PDOException $e) {
    flash("<pre>" . var_export($e, true) . "</pre>");
}

$columns = get_columns("Products");
//echo "<pre>" . var_export($columns, true) . "</pre>";
$ignore = ["id", "modified", "created"];
*/


<div class="container">
    <form method="post" onsubmit="upload(event); return false;" enctype="multipart/form-data">
        <div>
            Select image(s) to upload:
        </div>
        <div>
            <input type="file" name="images[]" id="fileToUpload" multiple required>
        </div>
        <div>
            <label for="product">Select Product:</label>
            <select name="product" id="product">
                <option value="">--Select Product--</option>
                <option value="iphone">Iphone</option>
                <option value="samsung">Samsung</option>
                <option value="huawei">Huawei</option>
            </select>
        </div>
        <div>
            <input type="submit" value="Upload" class="btn btn-dark">
        </div>
    </form>
    <div id="preview">
    </div>
</div>
--->
--->
