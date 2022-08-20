/*
    Document Object Model: Tree of nodes created by browser
    Js is used to read/write/manipulate DOM
1.  console.dir(document)  //shows alll properties and methods attached through document object.
2.  console.(document.domain)  //shows the domain
3.  console.(document.URL)  //shows url
4.  console.(document.title)  //shows url
5.  document.title = 123;
6.  console.(document.doctype)  //shows doc type
7.  console.(document.all)  //shows all html tags
8.  console.(document.all[10])  //shows specific html tag
9.  console.(document.forms)  //shows all forms
10. console.(document.links)  //shows all links
11. console.(document.images)  //shows all links

SELECTORS
1.  GETELEMENTBYID
    var element = document.getElementById("demo");
    i.   element.textContent = 'hello';
    ii.  element.innerText = 'Bye'          
         //innerText overrides textContent (but textContent overrides style behaviour)
    iii. element.innerHTML = '<h3>Hello</h3>'; //This h3 tag will inside of elemet tag
    element.style.borderBottom = 'solid 3px #000'

2.  GETELEMENTBYCLASSNAME
    var items = document.getElementByclassName("list-group-item"); //consider this is ul classname
    console.log(items)
    console.log(items[1])
    items[1].textContent = 'hello';
    items[1].style.fontWeight = 'bold';
    items[1].style.backgroundColor = 'yellow';

    //error, work work since its html collections.
    items.style.backgroundColor = 'yellow'; 
    
    //so this method is followed
    for(var i=0;i<items.length;i++){
        items[i].style.backgroundColor = 'yellow';
    }

3.  GETELEMENTBYTAGNAME
     var li = document.getElementByTagName("li");
    console.log(li)
    console.log(li[1])
    li[1].textContent = 'hello 3';
    li[1].style.fontWeight = 'bold';
    li[1].style.backgroundColor = 'yellow';
    for(var i=0;i<li.length;i++){
        li[i].style.backgroundColor = 'yellow';
    }

4.  QUERYSELECTOR
     var header = document.querySelector("#main-header"); //you can use tags,list items,class, any css selector
     header.style.borderBottom = 'solid 4px green';
     var submit = document.querySelector("input[type="submit"]");
     submit.value = "SEND";

    var lastItem = document.querySelector(".list-group-item:last-child");
    lastItem.style.color = 'blue';
    var secondItem = document.querySelector(".list-group-item:nth-child(2)");
    lastItem.style.color = 'coral';

5. QUERYSELECTORALL
    var titles = document.querySelectorAll('.title');
    console.log(titles)
    titles[0].textContent = 'hello';

    var odd = document.querySelectorAll('li:nth-child(odd)');
    var oeven = document.querySelectorAll('li:nth-child(even)');
    for(var i=0;i<odd.length;i++){
        odd[i].style.backgroundColor = 'red';
        even[i].style.backgroundColor = 'green';
    }

TRAVERSING DOM
    var itemList = document.querySelector("#items"); //ul is having id items

    //parentNode
    console.log(itemList.parentNode) // parent node of ul
    itemList.parentNode.style.backgroundColor = '#f4f4f4';
    console.log(itemList.parentNode.parentNode) // parent node of ul's parent 

    //parentElement
    console.log(itemList.parentElement) // parent Element of ul
    itemList.parentElement.style.backgroundColor = '#f4f4f4';
    console.log(itemList.parentElement.parentElement) // parent Element of ul's parent 

    //childNodes
    console.log(itemList.childNodes) // children of itemList (NodeList)

    //children    // children prefered over childNodes
    console.log(itemList.children) // children of itemList   (HTML Collection) 
    console.log(itemList.children[1]);
    itemList.children[1].style.backgroundColor = 'yellow';

    //firstChild
    console.log(itemList.firstChild); //useless firstElementChild is used

    //firstElementChild
    console.log(itemList.firstElementChild);
    itemList.firstElementChild.textContent = 'Hello 4'

    //lastChild
    console.log(itemList.lastChild); //useless lastElementChild is used

    /lastElementChild
    console.log(itemList.lastElementChild);
    itemList.lastElementChild.textContent = 'Hello 4'

    //nextSibiling
    console.log(itemList.nextSibiling);

    //nextElementSibiling
    console.log(itemList.nextElementSibiling);

    //previousSibiling
    console.log(itemList.previousSibiling);

    //previousElementSibiling
    console.log(itemList.previousElementSibiling);

CREATE ELEMENT
   //create a div
    var newDiv = document.createElement('div'); 
    //add id
    newDiv.id = "hello1"
    //add class
    newDiv.className = "hello"
    //add attr
    newDiv.setAttribute('title',"hello div");
    newDiv.style.fontSize = '30px'

    
    //create text node
    var newDivText = document.createTextNode('Hello World'); 
    newDiv.appendChild(newDivText)

    var container = document.querySelector('header .container'); 
    var h1 = document.querySelector('header h1')
    container.insertBefore(newDiv,h1);

    console.log(newDiv);

EVENTS
    var button = document.getElementById("btn").addEventListener('click',buttonClick);

    function buttonClick(e){
        document.getElementById('header-title').textContent = 'Changed';
        document.querySelector('#main').style.backgroundColor = '#f4f4f4';
         console.log(e.target);
         console.log(e.target.id);
         console.log(e.target.className);
         console.log(e.target.classList);


        console.log(e.clientX);
        console.log(e.clientY);
        console.log(e.offsetX);
        console.log(e.offsetY);
        console.log(e.altKey);
        console.log(e.cntrlKey);
        console.log(e.shiftKey);

    }




*/