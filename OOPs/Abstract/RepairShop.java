package OOPs.Abstract;
//abstract means hiding certain details and show only essential data.

public class RepairShop {
    public static void repairCar(Car car){
        System.out.println("Car is Repaired.");
    }
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();//here the wagonR and audi is initiated.
        Audi audi = new Audi();
        // but you can't initiate a Car because it's a abstract class
        // the main reason to create a abstract class to make a class
        // which use the inside functions not a the class
        //that's make car can anything the work is a just a repair.

        repairCar(wagonR);
        repairCar(audi);

    }
}
