import java.util.Scanner;

public class task117{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int inp1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter integer 2: ");
        int inp2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter integer 3: ");
        int inp3 = input3.nextInt();
        
        if (inp1 > inp2 && inp1 > inp3){
            System.out.println(inp1 + " is the biggest number input!");
        } else if (inp2 > inp1 && inp2 > inp3){
            System.out.println(inp2 + " is the biggest number input!");
        } else {
            System.out.println(inp3 + " is the biggest number input!");
        }
    }
}

