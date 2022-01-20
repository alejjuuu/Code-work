<script>
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Loops_and_iteration
//our regular for loop
let a = 1.0;
let b = 0.0;
for(let i = 0; i < 10; i++){
	b += 0.1;
}
console.log("For loop finished, a == b?", a==b, a, b);

let c = 0;
while(c < 10){
	c++;
	console.log(c);
}

let d = 0;
do{
	console.log("doing do-while");
}
while(d > 0);

//taken from the referenced site:
const arr = [3, 5, 7];
arr.foo = 'hello';
//loop over properties
for (let i in arr) {
   console.log(i); // logs "0", "1", "2", "foo"
}
//loop over iterable objects (i.e., arrays)
for (let i of arr) {
   console.log(i); // logs 3, 5, 7
}
</script>