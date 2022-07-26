//flatten array of array

//Q. Print all alements inside the array(including elements inside array of array)

let arr =[1,2,[3,4,5],6,7,[8,9,[10,11],12],13,[14,15],16];

let out="";
function flatten(arr){
    for(let i=0;i<arr.length;i++){
        if(Array.isArray(arr[i])){
            //recursion
            flatten(arr[i]);
            
        }else{
            out+=arr[i]+",";
        }
    }
    return out;
}
console.log(flatten(arr));