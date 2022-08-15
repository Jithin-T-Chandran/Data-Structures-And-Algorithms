/*
1. If only single <li></li> is wanted, document.querySelector('li')
2. If multiple <li></li> is wanted, document.querySelectorAll('li')
    for(let i of arr){
        console.log(i);
    }
    
3. if class name is "abc" then document.querySelector('.abc').
4.         arr.foreach(value,index){
            } 
5. JS functions are used to persform a perticular task.

*/  

const arr = ["Jithin","Akshay","John","Nika","Dianna","Bruce"];

// METHOD 1

// for(let i of arr){
//    let listItem =  document.createElement('li'); //1. creating li element
//    listItem.innerText = i;  //2. adding inner text

//     // 3. appending  list items to <ui> having class name "names"
//    document.querySelector('.names').appendChild(listItem);
   
// }

// METHOD 2
arr.forEach(function(i,index){
       let listItem =  document.createElement('li'); //1. creating li element
   listItem.innerText = `${index + 1} ${i}`;  //2. adding inner text

    // 3. appending  list items to <ui> having class name "names"
   document.querySelector('.names').appendChild(listItem);
});


// All list items from HTML to a new array using push() method
let allListItems = document.querySelectorAll('li');
let newArr = [];
allListItems.forEach(function(listItem){
    let Item = listItem.innerHTML;
    newArr.push(Item);
});
console.log(newArr);