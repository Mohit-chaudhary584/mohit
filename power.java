public class power {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
}
