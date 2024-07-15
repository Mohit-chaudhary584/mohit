public class subsequenc2 {
    public static void main(String[] args) {
        String a = "abcd";
        sub(a,"");
        System.out.println(count);
    }
    static int count = 0;
    public static void sub(String a, String ans){
        if(a.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        char s = a.charAt(0);
        sub(a.substring(1), ans);
        sub(a.substring(1), ans+s);
    }
}
