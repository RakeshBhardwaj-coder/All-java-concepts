package Methods;

public class passByValue {//pass by value means copy of parameter pass in methods
    //this is for showing that the java is a Always Pass by Values.
    public static void main(String[] args) {
        int a=26;
        int b=27;
        swap(a,b);
        System.out.println(a+" "+b);
        //value of a and b is not changing by the pass by value.
        System.out.println("Above the value of a and b is not changed by the pass by value.");
        System.out.println("but Remember in non-primitive data type,is a pass by value" +
                "but its make a reference to a actual parameter,by this the value of a and b" +
                "will not change but the parameter like a pass by reference, that quite confusing" +
                "so make your study strong.");
    }

    static  void swap(int c,int d){//here I'm gonna swap but by the pass by value
        // the value of a and b will be not change.
        int temp = c;
        c = d;
        d = temp;
    }
}
