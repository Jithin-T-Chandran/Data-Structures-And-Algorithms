//Closure
/* 
Note:
parent object is window object.
lexical scoping => describes how child has access to parent variable

*/
let count =0;      //i. can't  declare count globally other function override 
function counter(){
    //let count =0; ii. cant work as expected
    console.log(count+=1);
}
counter();
counter();
counter();

//----------------------------------------------------------------------------------

//by using closure
function counter(){
    let count=0;
    function counterimp(){
          console.log(count+=1);
    }
   return counterimp;
}
let result = counter();
result();
result();
result();