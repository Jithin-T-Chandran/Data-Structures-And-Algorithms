// 1. class example
class Cars {
    constructor(name,age){
      this.name = name;
      this.age = age;
    }
    expiry(){
      return(new Date().getFullYear() - this.age)
    }
  }
  
  var cars = new Cars("Maruthi",2015);
  console.log(cars.expiry());




// 2. inheritance class
class car {
    constructor(brand){
      this.carName = brand;
    }
    present(){
      return `I have a ${this.carName}`;
    }
  }
  
  class model extends  car{
    constructor(brand,model){
      super(brand);
      this.model = model;
    }
    show(){
      return(`${this.present()} and its model is ${this.model}`)
    }
  }
  
  let ob1 = new model("Maruthi","dezire");
  console.log(ob1.show());

  // 3. getter and setter
  class car{
    constructor(name){
      this.carName = name;
    }
    get nameOfCar(){
       return this.carName;
    }
    set nameOfCar(x){
      return this.carName = x;
   }
  }
  var ob = new car("Audi");
  
  //using variable
  console.log("variable",ob.carName);
  
  //using getter
  console.log("getter",ob.nameOfCar);
  
  //using setter
  ob.nameOfCar='Suzuki'
  console.log("setter",ob.nameOfCar);

  //4. static
  class car{
    constructor(name){
      this.carName = name;
    }
   static hello(){
    return "Hello user"
   }
  }
  
  var ob = new car("Audi");
  
  // static method can't be called using object. TypeError: ob.hello is not a function
  //console.log(ob.hello());
  console.log(car.hello());
  
  