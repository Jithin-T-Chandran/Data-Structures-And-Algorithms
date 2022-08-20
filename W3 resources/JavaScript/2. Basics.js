/*
 1. Array.isArray(<array_name>): //check whether its an array or not
 2. The join() method also joins all array elements into a string.It behaves just like 
    toString(), but in addition you can specify the separator:
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    document.getElementById("demo").innerHTML = fruits.join(" * ");
    o/p =>  Banana * Orange * Apple * Mango
 3. shift()
    The shift() method removes the first array element and "shifts" all other elements to a lower index.
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    console.log(fruits.shift());
    o/p =>  Orange,Apple,Mango
 4. unshift()
    The unshift() method adds a new element to an array (at the beginning), and "unshifts" older elements:
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    fruits.unshift("Lemon");
    o/p =>  Lemon,Banana,Orange,Apple,Mango
 5. concat() The concat() method creates a new array by merging (concatenating) existing arrays:
    const myGirls = ["Cecilie", "Lone"];
    const myBoys = ["Emil", "Tobias", "Linus"];
    const myChildren = myGirls.concat(myBoys); //The concat() method can take any number of array arguments:
 6. The splice() method adds new items to an array.
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    fruits.splice(2, 0, "Lemon", "Kiwi");
    The splice() method returns an array with the deleted items:
 7. splice() // to remove elements without leaving "holes" in the array:
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    The first parameter (0) defines the position where new elements should be added 
    (spliced in).
    The second parameter (1) defines how many elements should be removed.
    fruits.splice(0,2);
    o/p =>  Apple,Mango
8.  slice()  //slices out a piece of an array into a NEW ARRAY.
             //slice() method does not remove any elements from the source array.
    const fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
    const citrus = fruits.slice(1);
    o/p =>  Orange,Lemon,Apple,Mango
9.  The sort() method sorts an array alphabetically:(for strings)
    Numeric Sort()
    const points = [40, 100, 1, 5, 25, 10];
    points.sort(function(a, b){return a - b});   //(b-a for descending)
10. reverse()
11. finding maximum element in array Math.max.apply(null, arr);
12. <array>.forEach((value, index, array)=> {
        //code 
    });
13. map() 
    //The map() method creates a new array by performing a function on each 
          array element, does not change the original array.
          const arr2 = arr.map((value, index, array)=> {
               //code
          });
14. The filter() method creates a new array with array elements that passes a test.
    const arr2 = arr2.filter((value, index, array)=> {
        //code
    });
15. reduce() method runs a function on each array element to produce (reduce it to)
    a single value.
    The reduce() method works from left-to-right in the array. See also reduceRight().
    const numbers = [45, 4, 9, 16, 25];
    let sum = numbers.reduce((total, value, index, array)=> {
    return total + value;
    });
    console.log(sum);
16. The every() method check if all array values pass a test.
    const numbers = [45, 4, 9, 16, 25];
    let value = numbers.every((value, index, array)=> {
    return value > 18;
    });
    console.log(value)// false
17. The some() method check if some array values pass a test.
    const numbers = [45, 4, 9, 16, 25];
    let value = numbers.some((value, index, array)=> {
    return value > 18;
    });
    console.log(value)// true
18. The indexOf() method searches an array for an element value and returns its position.
    //array.indexOf(item, start)
    If the item is present more than once, it returns the position of the first occurrence.
19. Array.lastIndexOf() is the same as Array.indexOf(), but returns the position of the last 
    occurrence of the specified element. //array.lastIndexOf(item, start)
20. The find() method returns the value of the first array element that passes 
    a test function.
    const numbers = [4, 9, 16, 25, 29];
        let first = numbers.find((value, index, array)=> {
        return value > 18;
    });
21. The findIndex() method returns the index of the first array element that 
    passes a test function.
    const numbers = [4, 9, 16, 25, 29];
        document.getElementById("demo").innerHTML = "First number over 18 has index " + numbers.findIndex((value, index, array)=> {
        return value > 18;
    });
22. The Array.from() method returns an Array object from any object with a length property
    or any iterable object.
    const myArr = Array.from("ABCDEFG"); //A,B,C,D,E,F,G
23. The Array.keys() method returns an Array Iterator object with the keys of an array.
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    const keys = fruits.keys();
    for (let x of keys) {
      text += x + "<br>";
    } 
14. Array entries()  //Create an Array Iterator, and then iterate over the key/value pairs:
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    const f = fruits.entries();

    for (let x of f) {
    document.getElementById("demo").innerHTML += x;
    }
    output
    ------
    0,Banana
    1,Orange
    2,Apple
    3,Mango
15. Array.includes() to arrays. This allows us to check if an element is present in an array 
    (including NaN, unlike indexOf). //array.includes(search-item)
    const fruits = ["Banana", "Orange", "Apple", "Mango"];
    fruits.includes("Mango"); // is true
16. Date()
    getFullYear(), getMonth(), getDate(), getHours(), getDay()	
17. Math Object //Unlike other objects, the Math object has no constructor.
    Math.PI, Math.round(x), Math.ceil(x), Math.floor(x), Math.trunc(x).
    Math.pow(x, y), Math.sqrt(x), Math.abs(x), Math.min(), Math.max(), Math.random()
18. age = Number(age);
    if (isNaN(age)) {
      voteable = "Input is not a number";
    } else {
      voteable = (age < 18) ? "Too young" : "Old enough";
    }
19. The For In Loop
    const person = {fname:"John", lname:"Doe", age:25};

        let text = "";
        for (let x in person) {
        text += person[x];
    }
20. Array.forEach()
    const numbers = [45, 4, 9, 16, 25];
        let txt = "";
        numbers.forEach(myFunction);

        function myFunction(value, index, array) {
        txt += value;
    }
21. Sets : A JavaScript Set is a collection of unique values.
    new Set(), add(), delete(), has(), forEach(), values()
    
    const letters = new Set();
        // Add Values to the Set
        letters.add("a");
        letters.add("b");
        letters.add("c");
    // Display set.size
    console.log(letters.size);
23. Maps: A Map holds key-value pairs where the keys can be any datatype.
        new Map()	Creates a new Map
        set()	    Sets the value for a key in a Map
        get()	    Gets the value for a key in a Map
        delete()	Removes a Map element specified by the key
        has()	    Returns true if a key exists in a Map
        forEach()	Calls a function for each key/value pair in a Map
        entries()	Returns an iterator with the [key, value] pairs in a Map
        Property	Description
        size	    Returns the number of elements in a Map

24. undefined and null are equal in value but different in type:
        typeof undefined      // undefined
        typeof null           // object
25. In JavaScript there are 5 different data types that can contain values:
        string
        number
        boolean
        object
        function
26. There are 6 types of objects:
        Object
        Date
        Array
        String
        Number
        Boolean
27. And 2 data types that cannot contain values:
        null
        undefined
28. Primitive Data: string, number, boolean, undefined.
29. Complex Data:  function, object
30. search() method uses an expression to search for a match, and returns 
    the position of the match.
    let text = "Visit W3Schools!"; 
    let n = text.search("W3Schools");
    console.log(n)  // 6

31. The replace() method returns a modified string where the pattern is replaced.
    let text = "Visit Microsoft!";
    let result = text.replace("Microsoft", "W3Schools");
32. try {
         adddlert("Welcome guest!");
    }
    catch(err) {
         document.getElementById("demo").innerHTML = err.message;
    }
33. Scope
    Before ES6 (2015), JavaScript had only Global Scope and Function Scope.
    ES6 introduced two important new JavaScript keywords: let and const.(Block scope)







*/