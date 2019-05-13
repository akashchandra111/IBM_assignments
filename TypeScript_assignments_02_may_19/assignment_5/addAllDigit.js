"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter the number to find it's sum: ", function (answer) {
    var num = parseInt(answer);
    var total = 0;
    while (num != 0) {
        total += num % 10;
        num = Math.floor(num / 10);
    }
    console.log("Number is: " + total);
    runtimeVal.close();
});
