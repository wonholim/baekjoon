const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString();
let line = input.split("\n");
const a = line[0].split(" ");
const b = line[1].split(" ");
for (let i = 0; i < b.length; i++) {
    b[i] *= a[1];
}
let min = b[0] + b[1];
for (let i = 2; i < b.length; i++) {
    tmp = b[i - 1] + b[i];
    min = tmp < min ? tmp : min;
}
console.log(min);
