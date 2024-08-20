import java.util.Scanner;

public class task116 {
    public static void main(String[] args) {
        Scanner panlidrome = new Scanner(System.in);
        System.out.println("Enter any word: ");

        String isit = panlidrome.nextLine();
        String itis = "";
        for (int i = 0; i < isit.length(); i++){
            itis = isit.charAt(i) + itis;
        }
        if (isit.equals(itis)){
            System.out.println("The input is panlidrome!");
        } else {
            System.out.println("The input is not panlidrome!");
        }
    }
}