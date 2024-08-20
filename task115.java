public class task115{
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String d = (b + "!");
        String c = d;

        boolean b1 = (a == b); // a must equal to b
        boolean b2 = d.equals(b + "!"); // d must not equal to b
        boolean b3 = !c.equals(a); // c must not equal to a

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
