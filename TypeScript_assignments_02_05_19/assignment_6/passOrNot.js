"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function passOrNot(num1, num2, num3) {
    if (num1 >= 40) {
        if (num2 >= 40) {
            if (num3 >= 40) {
                if (num1 + num2 + num3 >= 125) {
                    console.log("Passed");
                }
            }
        }
    }
    else {
        console.log("Failed");
    }
}
runtimeVal.question("Enter all 3 numbers with spaces: ", function (answer) {
    var sub = answer.split(" ");
    var sub_1 = parseInt(sub[0]);
    var sub_2 = parseInt(sub[1]);
    var sub_3 = parseInt(sub[2]);
    passOrNot(sub_1, sub_2, sub_3);
    runtimeVal.close();
});
