const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString();
let line = input.split("\n");
let str = line[1].trim();
console.log(str[str.length - 1] === "G" ? str.slice(0, -1) : str + "G");
