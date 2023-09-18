function main(){
let isGreaterThanTwo;
let num;
num = 6;
isGreaterThanTwo = num > 2;
repeat { 
num = num + 1;
console.log(num);
}
until(!(num > 10))
}

function double(integer n) {
let result;
let input;
input = prompt();
;
result = n + input;
return result;
}

main();
