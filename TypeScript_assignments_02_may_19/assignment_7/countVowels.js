"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter string to count all vowels repeatition: ", function (answer) {
    var counter_a = 0;
    var counter_e = 0;
    var counter_i = 0;
    var counter_o = 0;
    var counter_u = 0;
    for (var i = 0; i < answer.length; ++i) {
        if (answer[i] == 'a' || answer[i] == 'A')
            ++counter_a;
        else if (answer[i] == 'e' || answer[i] == 'E')
            ++counter_e;
        else if (answer[i] == 'i' || answer[i] == 'I')
            ++counter_i;
        else if (answer[i] == 'o' || answer[i] == 'O')
            ++counter_o;
        else if (answer[i] == 'u' || answer[i] == 'U')
            ++counter_u;
    }
    console.log("\na occured: " + counter_a + " times.\ne occured: " + counter_e + " times.\ni occured: " + counter_i + " times.\no occured: " + counter_o + " times.\nu occured: " + counter_u + " times.\n");
    runtimeVal.close();
});
