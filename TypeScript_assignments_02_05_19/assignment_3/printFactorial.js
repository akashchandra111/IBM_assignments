"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter Number to find factorial: ", function (answer) {
    var num = parseInt(answer);
    var total = 1;
    while (num >= 1)
        total *= num--;
    console.log("Factorial is: " + total);
    runtimeVal.close();
});
