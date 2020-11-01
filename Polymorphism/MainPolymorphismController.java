package OOPs.Polymorphism;

public class MainPolymorphismController {
    public static void main(String[] args) {
        dog d = new dog();
        pet p = d;

//
//        d.walk();//both will say dog is walking
//        p.walk();//this called runtime Polymorphism

        //Compile-time poly-you can use same function buy you have use different signature.
        compile_time();
        compile_time("This get to 's' and take the 2nd compil_time function this" +
                " happens using the compile-time polymophism. ");

        System.out.println(d.Name);
        System.out.println(p.Name);
    }
    public static void compile_time(){
        System.out.println("I'm the compile-time Polymorphism");
    }
    public static void compile_time(String s){
        System.out.println(s);
    }

}
