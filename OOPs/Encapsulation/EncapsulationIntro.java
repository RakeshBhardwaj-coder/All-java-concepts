package OOPs.Encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(21);
        s.setName("Rakesh");
        //Here I'm accessing the age indirectly now we add validation here ok.
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
