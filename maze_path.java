public class maze_path {
    static int count = 0;
    public static void main(String[] args) {
        path(0, 0, 2, 2, "");
        System.out.println(count);
    }
    public static void path(int a, int b, int ab, int bc, String ans){
        if(a==ab && b==bc){
            System.out.println(ans);
            count++;
            return;
        }
        if(a<ab){
            path(a+1, b, ab, bc, ans+"H");
        }
        if(b<bc){
            path(a, b+1, ab, bc, ans+"V");
        }
    }
}
