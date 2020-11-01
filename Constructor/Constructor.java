package OOPs.Constructor;

class vehicle{
int wheels;
String Color;
int headLights=2;
    vehicle(int wheels){//it's called constructor
        //its name should similar to the class
        //Its doesn't have any return type.


        this.wheels=wheels; //this is use for the same pass name
        //this will says only current  object,like here this for int wheels in Constructor.vehicle class
        //and other is for the value taken in function.
    }

    //Here I'm going to overriding the constructor but the parameter will be different
      vehicle(int wheels,String Color){
        this.wheels = wheels;//using 'this.' to explain  to the computer wheels and color is form the "class Constructor.vehicle"
        this.Color = Color;//and after the equals the name of wheel and color is calling function from the main class
        headLights = 2;
    }
    //Example of an error
    //vehicle(){
        //this is a default constructor
    //}
}
public class Constructor {


    public static void main(String[] args) {
       vehicle car = new vehicle(4);
       vehicle bike = new vehicle(2);
       System.out.println(car.wheels+" wheels car is there.");
       System.out.println(bike.wheels+" wheels bike is there.");

//now if we don't know about the Constructor.vehicle wheel and color then we override the constructor:
        vehicle redCar = new vehicle(4,"red");
        System.out.println(redCar.wheels+" wheeler "+redCar.Color+" color car with "+ bike.headLights+" headlights is here,are you willing to " +
                "buy this amazing car,If I get chance then I'm gonna.");

//      vehicle anError = new vehicle();
        /*this is a default constructor.
        and you can't call default constructor because you has created lots of constructor now this need a different parameter
        and this a empty parameter you can't create now a default constructor.*/


    }
}
