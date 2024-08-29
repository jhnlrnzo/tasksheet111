public class task120   {
    public static void total(int... nums){
        int sum = 0;
        for (int num: nums){
            for (int i = 0; i <= num; i++){
                sum = sum + i;
                System.out.println(sum);
            }
            sum = 0;
        }      
    }
    public static void main(String[] args) {
        total(4,5,10);
    }
}

