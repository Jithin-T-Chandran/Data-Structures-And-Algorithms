/*
    CURRYING
    --------
        function multiply(a,b){
         return a * b
        }

        var multiplyByTwo =  multiply.bind(this,2);
        console.log(multiplyByTwo(3));
        

1. call  : attaches function to the object.
    let obj = { num: 2 };
    let addToThis = function (a) {
        return this.num + a;    
    };

    //functionName.call(obj,functionalArguments)
    let sum = addToThis.call(obj,67);
    console.log(sum);

2. apply  : attaches function to the object and array as parameters
    let obj = { num: 5 };
    let arr = [3,4,5,6];
    let addToThis = function (a,b,c,d) {
        return this.num + a + b + c +d;    
    };

    
    let sum = addToThis.apply(obj,arr);
    console.log(sum);

3. bind  : attaches function to the object and array as parameters
    let obj = { num: 5 };
    let addToThis = function (a,b,c) {
        return this.num + a + b + c;    
    };

    let bound = addToThis.bind(obj);
    console.log(bound(1,2,3));
*/