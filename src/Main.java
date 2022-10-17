// Part 1
class myClass{
    int age;
} // myClass

class myClass1{
    int age;
} // myClass1

public class Main {
    public static int myMethod(){
        int x = 91; // Assigning a value to x
        int y = 129; // Creating the variable(int) y
        x = y; // Assigning value of y to x
        return x; // Returning the x
    }
    public static void main(String[] args) {
        // 1.1
        myClass I = new myClass();
        int x = 9;
        int y = 18;
        y = x;
        I.age = y;
        System.out.println(y + x + I.age);
         // 1.2
        myClass1 Y = new myClass1(); // Creating myClass1 object, y
        Y.age = myMethod(); // Passing the value of Y.age into method that references and changes it
        System.out.println(Y.age); // Printing out the value of Y.age after myMethod has been executed

    }
}
