function Car(name,power){
    this.name = name;
    this.power = power;
    this.run = () => {
        
        console.log('hello car');
        console.log(this.name+'car is running')
    }
}
Car.prototype.haha = () => {
    console.log("smile");
}
var car1 = new Car("ferary","2000");