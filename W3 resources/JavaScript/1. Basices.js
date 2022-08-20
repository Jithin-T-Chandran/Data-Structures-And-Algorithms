/*
* document.getElementById('myImage').src='pic_bulbon.gif';   //for picture, myImage is id of <img>
* document.getElementById("demo").style.fontSize = "35px";
* document.getElementById("demo").style.display = "none"; //Making it invisible
* document.getElementById('demo').style.display='block';  //Making it visible

* document.getElementById('demo').innerHTML = 'Hello JavaScript';


Basics
------
1.  Placing scripts at the bottom of the <body> element improves the display speed, 
    because script interpretation slows down the display.
2.  JS display in html: innerHTML, document.write(), window.alert(), console.log().
3.  Using document.write() after an HTML document is loaded, will delete all existing HTML:
4.  In JavaScript, the window object is the global scope object, that means that variables, properties, 
    and methods by default belong to the window object. 
5.  window.print() : To print the content of the current window. In HTML, JavaScript programs are executed
    by the web browser.
6.  JavaScript statements are composed of: Values, Operators, Expressions, Keywords, and Comments.
7.  The JavaScript syntax defines two types of values:
     1. Fixed values are called Literals, eg: Numbers,Strings
     2. Variable values are called Variables. eg: var, let and const to declare variables.
8.  Variables defined with let.
     1. cannot be Redeclared.
     2. must be Declared before use.
     3. have Block Scope.
9.  With let, redeclaring a variable in the same block is NOT allowed,in another block, IS allowed:
10. Variables defined with let are also hoisted to the top of the block, but not initialized.
    Meaning: Using a let variable before it is declared will result in a ReferenceError:
11. Variables defined with const (It does not define a constant value. It defines a constant reference to a value.)
     1. cannot be Redeclared.
     2. cannot be Reassigned.
     3. have Block Scope.
12.
    function add(num1=100,num2){
        console.log(num1+num2);
    }
    add(undefined,3); //output 103

13. Node Js is a runtime enviornment, having V8 engine, NodeJs libraries and Js 
14. Variables defined with var are hoisted to the top and can be initialized at any time.
15.
    ==	equal to
    ===	equal value and equal type
16. When adding a number and a string, JavaScript will treat the number as a string.
    let x = 16 + "Volvo";   =>  16Volvo
    let x = "Volvo" + 16 + 4;   =>  Volvo164
17. In a function definition, 'this' refers to the "owner" of the function.
18. Events:
    An HTML web page has finished loading
    An HTML input field was changed
    An HTML button was clicked
19. Normally, JavaScript strings are primitive values, created from literals:
    let x = "John"; // x is a string
    But strings can also be defined as objects with the keyword new:
    let y = new String("John"); // y is an object
    Do not create Strings objects. The new keyword complicates the code and 
    slows down execution speed. String objects can produce unexpected results:
20. JavaScript objects cannot be compared.
21. There are 3 methods for extracting a part of a string:
    slice(start, end) //extracts a part of a string and returns the extracted part in a new string.
    substring(start, end)
    substr(start, length)
22. replace() method replaces a specified value with another value in a string:
    let text = "Please visit Microsoft!";
    let newText = text.replace("Microsoft", "W3Schools");
23. concat() joins two or more strings:
    let text1 = "Hello";
    let text2 = "World";
    let text3 = text1.concat(" ", text2)
24. All string methods return a new string. They don't modify the original string.
    Strings are immutable: Strings cannot be changed, only replaced.
25. The trim() method removes whitespace from both sides of a string:
    let text1 = "      Hello World!      ";
    let text2 = text1.trim();
26. padStart()
    let text = "5";
    let padded = text.padStart(4,"0");
27. padEnd()
    let text = "5";
    let padded = text.padEnd(4,"x");
28. A string can be converted to an array with the split() method:
29. The indexOf() method returns the index of (the position of) the first occurrence of a 
    specified text in a string:
30. The lastIndexOf() method returns the index of the last occurrence of a specified text in a string:
31. match()
    The match() method searches a string for a match against a regular expression,
    and returns the matches, as an Array object.
    let text = "The rain in SPAIN stays mainly in the plain";
    text.match(/ain/g);
    o/p =>  ain,ain,ain
32. includes()
    The includes() method returns true if a string contains a specified value
    let text = "Hello world, welcome to the universe.";
    text.includes("world");
33. startsWith()
    he startsWith() method returns true if a string begins with a specified value, otherwise false:
    let text = "Hello world, welcome to the universe.";
    text.startsWith("Hello");
34. endsWith()
    The endsWith() method returns true if a string ends with a specified value, otherwise false:
35. JavaScript Numbers are Always 64-bit Floating Point
36. In regular functions the this keyword represented the object that called the function, which 
    could be the window, the document, a button or whatever.
37. Hoisting is JavaScript's default behavior of moving declarations to the top.
    *A variable can be used before it has been declared.
    *Variables defined with let and const are hoisted to the top of the block,
     but not initialized.
    *The variable is in a "temporal dead zone" from the start of the block 
     until it is declared:
    *This is because only the declaration (var y), not the initialization 
     (=7) is hoisted to the top.
38. "use strict"; Defines that JavaScript code should be executed in "strict mode".
     It helps you to write cleaner code, like preventing you from using 
     i. undeclared variables.
     ii. undeclared object:
     *Deleting a function is not allowed.
     *Duplicating a parameter name is not allowed:
     *Octal numeric literals are not allowed:
     *Octal escape characters are not allowed:
     *Writing to a read-only property is not allowed:
     *deleting an undeletable property is not allowed:
     *The word arguments cannot be used as a variable:
     *The with statement is not allowed:
     *For security reasons, eval() is not allowed to create variables in the scope from which it was called.
39. The call() and apply() methods are predefined JavaScript methods.
    They can both be used to call an object method with another object as argument.
40. Modules: JavaScript modules allow you to break up your code into separate files.
    JavaScript modules rely on the import and export statements.
    There are two types of exports: Named and Default.
        Named export
        ------------
        const name = "Jesse";
        const age = 40;
        export {name, age};

        default export
        --------------
        const message = () => {
        const name = "Jesse";
        const age = 40;
        return name + ' is ' + age + 'years old.';
        };
        export default message;

    You can import modules into a file in two ways, based on if they are named
    exports or default exports.
        Named import
        ------------
        *import { name, age } from "./person.js";

        default export
        --------------
        *import message from "./message.js";
41. JavaScript JSON
    JSON is a format for storing and transporting data.
    JSON is often used when data is sent from a server to a web page.


*/
