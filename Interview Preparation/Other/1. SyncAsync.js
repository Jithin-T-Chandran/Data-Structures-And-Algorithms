//synchronous
function Sync(milliSecondsTime){
    console.log("Start");
        var date = new Date();
        while((new Date() - date) < milliSecondsTime){

            
        }
    console.log("End");
}
Sync(3000);
Sync(1000);
Sync(2000);



//synchronous
function Async(){
    console.log("End");
}


console.log("Start");
setTimeout(Async,3000);

console.log("Start");
setTimeout(Async,1000);

console.log("Start");
setTimeout(Async,2000);