public class maze {
    public static void main(String[] args) {
        System.out.println(paths(5, ""));
    }
    public static int paths(int n, String ans){
        int count = 0;
        if(n==0){
            System.out.println(ans);
            count++;
            return 1;
        }
        if(n<0){
            return 0;
        }
        
        for(int i=1; i<=6; i++){
            count += paths(n-i, ans+i);
        }
        return count;
    }
}
