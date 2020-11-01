package OOPs.Inheritance;

public class mainInheritanceController {
    public static void main(String[] args) {
       Teacher t = new Teacher();
       t.name = "Khan sir";

       t.walk();
       t.eat();
       t.Teach();

       Singer s = new Singer();
       s.name = "Arjit Singh";

       s.eat();
       s.walk();
       s.Singing();
    }
}
