package OOPs.Encapsulation;

    public class Student {//Here I'm using encapsulation so we will
        //        be take a private variable now I can't use in my class to another class so
//        how I can use this like a confidential .
//        we use set get function ha ha ha...
         private int age;
         private String name;


        public int getAge() {
            return age;
        }

        public void setAge(int age) {

            if (age > 55) {
                System.out.println("you are to old");
                System.out.println(55-21);

            }else{
                System.out.println("You are younger than old person");
            }
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }