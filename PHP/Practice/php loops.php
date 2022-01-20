
<?php
/*--------------------------*/ 
$message = "While loop";
echo $message;
echo "<br>/n";

$a = 10;
while($a > 0){
 $a--;
  echo "a is $a <br>\n";
}
/*--------------------------*/ 
$message2 = " do loop runs at least once";
echo $message2;
echo "<br>/n";
//runs at least once
$a = 0;
do{
  echo "a is greater than zero <br>\n";
}
while($a > 0);

$a = 10;
do {
  echo "a is $a <br>\n";
  $a--;
}
while($a > 0);
/*--------------------------*/ 
$message3="for loop";
echo $message3;
echo "<br>/n";

//you don't normally declare the increment like this
//but I'm doing it for sake of example
$increment = 1;//<--change this value and see how it changes
for($i = 0; $i < 10; $i+=$increment){
  echo "i is $i <br>\n";
}
/*--------------------------*/ 
$message4= "For each ";
echo $message4;
echo "<br>/n";

$arr = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
//no I don't know why I chose to do days of the week

//this will look a bit backwards if you come from other language backgrounds
//note we take the array first, then we get the value "as" the next variable we declare
foreach($arr as $day){
 echo "$day <br>\n";
}

//we can also return the key/value separately for associative arrays
foreach($arr as $index=>$value){
 echo "$index => $value<br>\n";
}
/*--------------------------*/

?>

