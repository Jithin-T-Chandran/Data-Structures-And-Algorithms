/*
  JS is a synchronous single-threaded language
  Everything in javascript happens inside an Execution Context
* As soon as whole JS program run,
  Global Execution Context is created, consistes of 
        i.Memory (Variable enviornment)
        ii.Code (Thread of execution)

//How JS code is executed?
 Global execution Context has two phases ,
 i. Phase 1: Memory creation phase (allocating m/y of all variables and functions (initially undefined))
 i. Phase 2: Code execution phase(JS executed line by line)

 Inside Code execution phase new execution phase created and executes, so on


* Call Stack : its bottom is global execuion



*Lexical Enviornment: Whenever an execution context is created, lexical enviornment is created
 Its a local memory along with Lexical Enviornment of  its parent.
 (where its lexically or physically)
 its works like hierarchy, if function A contains a function B inside of it. if B access a 
 variable which is not present in B, it moves to Lexical Enviornment of  its parent. 
 That is A. if thats is not present it moves to Lexical  Environment of A's parent ans so on.
 finally at global no parent so it points to null.
 This process of finding is call SCOPE CHAINING.

(FOR ANY HOISTING QUESTIONS,)
let and const variables are hoisted in the temperal dead zone for the time being.
 *Temporal Dead Zone: its a time between since when let variable declares
  and till it initialises a value
        eg:     console.log(a);
                let a = 10;
                var b = 20;

            o/p:   Uncaught ReferenceError: Cannot access 'a' before initialization

var variables are attached to the global object.but let and const are stored in different m/y space
than global.

 3 type of errors
 i.   Syntax error
            eg 1:    
                let a = 10;
                let a = 20;

            o/p:   Uncaught SyntaxError: Identifier 'a' has already been declared
             eg 2:    
                const a;
                a = 20;
                console.log(a);

            o/p:   Uncaught SyntaxError: Missing initializer in const declaration
            

 ii.  Reference error   //Access a variable before initialising it.
         eg:    console.log(x);
                let a = 10;
                var b = 20;

            o/p:   Uncaught ReferenceError: x is not defined

 iii. Type error    //Assignment to a const variable
        eg:    const a = 1000;
                a = 20;

            o/p:  Uncaught TypeError: Assignment to constant variable.



*let and const are block scoped and var is global scoped.
var scope is inside function.

*Shadowing

        var a = 100
        if(true){
                var a = 20 //here inner a is shadowing outer a so prints 20
                console.log(a)
        }
illegal Shadowing
        let a = 100
        if(true){
                var a = 20 //here this cause error because outer a is let and inner a is var 
                console.log(a)
        }

Closure: A function bind along with its lexical envionment together is called closure.
      eg:
      
      function x(){
        var a = 20;
        function y(){
          console.log(a)
        }
        return y;
      }
      var z = x();
      z();


setTimeout() closure:
---------------------
function x(){
        for(let i=1;i<=5;i++){   //if var is used instead of let,unusual result will print.
                setTimeout(function(){
                        console.log(i);
                },i*1000);
        }
        console.log("Namaste Javascript");  
}
x();

if you want to use var itself,

function x(){
        for(let i=1;i<=5;i++){   //if var is used instead of let,unusual ressult will print.
           function close(i){
                setTimeout(function(){
                        console.log(i);
                },i*1000);
           }
           close(i);
        }
        console.log("Namaste Javascript");  
}
x();










*/