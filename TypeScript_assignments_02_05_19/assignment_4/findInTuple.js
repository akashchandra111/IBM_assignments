var tuple = {
    "user_1": "akash",
    "user_2": "dheeraj",
    "user_3": "shivam"
};
function findInTuple(val) {
    for (var i in tuple) {
        if (i == val) {
            return i + ": " + tuple[i];
        }
    }
    return "Nothing is found!";
}
console.log(findInTuple("user_1"));
console.log(findInTuple("user_5"));
