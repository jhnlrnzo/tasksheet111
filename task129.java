interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Gorilla implements Animal{
    // put gorilla food into cage
    public boolean feed(boolean timeToEat){
        if (timeToEat) {
            System.out.println("Get food for gorilla, put it in gorilla's cage.");
            return true;
        }else{
            System.out.println("Gorilla wait for eating time.");
            return false;
        }
    }
    // lather, rinse, repeat
    public void groom(){
        System.out.println("Gorilla is being groomed. Lather, rinse, repeat.");
    }
    // pet at your on risk
    public void pet(){
        System.out.println("Careful! Pet at your on risk.");
    }

}
public class task129{
    public static void main(String[] args) {
        Gorilla gori = new Gorilla();
        gori.feed(true);
        gori.feed(false);
        gori.groom();
        gori.pet();
    }
}
