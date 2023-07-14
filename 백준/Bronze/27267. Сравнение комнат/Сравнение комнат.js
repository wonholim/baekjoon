const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString();
let arr = input.split(" ").map(Number);

if (arr[0] * arr[1] === arr[2] * arr[3]) {
    console.log("E");
} else {
    console.log(arr[0] * arr[1] > arr[2] * arr[3] ? "M" : "P");
}
