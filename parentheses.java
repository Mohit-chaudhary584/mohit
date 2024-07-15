public class parentheses {
    public static void main(String[] args) {
        par(2, 0, 0, "");
    }
    public static void par(int a, int b, int c, String ans){
        if(b==a && c==a){
            System.out.println(ans);
            return;
        }
        if(b<a)
        par(a, b+1, c, ans+"(");
        if(b>c)
        par(a, b, c+1, ans+")");
    }
}