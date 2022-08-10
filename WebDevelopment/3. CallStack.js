/*
* As soon as whole JS program run,
  Global execution phase is created, consistes of 
        i.Memory
        ii.Code
* Global execution phase has two phases ,
 i. Phase 1: Memory creation phase (allocating m/y of all variables and functions (initially undefined))
 i. Phase 2: Code execution phase(JS executed line by line)

 *Inside Code execution phase new execution phase created and executes, so on


* Call Stack : its bottom is global execuion



*Lexical Enviornment: Its a local memory along with Lexical Enviornment of  its parent.
 its works like hierarchy, if function A contains a function B inside of it. if B access a variable which is not present
 in B, it moves to Lexical Enviornment of  its parent. That is A. if thats is not present it moves to Lexical 
 Environment of A's parent ans so on.
 finally at global no parent so it points to null.
 This process of finding is call SCOPE CHAINING.



 *Temporal Dead Zone: its a time between since when let variable hoisted
  and till it initialises a value
        eg:     console.log(a);
                let a = 10;
                var b = 20;

            o/p:   Uncaught ReferenceError: Cannot access 'a' before initialization


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



*/