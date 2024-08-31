import static java.lang.Math.*;
public class task121{
    public static int add(int a, int b) {
       return (a + b);
    }
    public static int subtract(int a, int b){
        return (a - b);
    }
    public static int multiply(int a, int b){
        return (a * b);
    }
    public static float divide(int a, int b){
        return (a / b);
    }
    public static void main(String[] args) {
        System.out.println("Adding two integers: " + add(4, 8));
        System.out.println("Subtracting two integers: " + subtract(9, 17));
        System.out.println("Multiplying two integers: " + multiply(7, 10));
        System.out.println("Dividing two integers: " + divide(6, 10));
    }
}
