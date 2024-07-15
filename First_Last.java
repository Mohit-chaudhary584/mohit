public class First_Last {
    public static void main(String[] args) {
        int[] arr = {12,11,3,4,5,78,9,4,22,13};
        int n = 4;
        int i = 0;
        System.out.print(first(arr, n, i)+" ");
        int j = arr.length;
        System.out.print(last(arr, n , j-1));
    }
    public static int first(int[] arr, int n, int i){
        if(arr[i]==n){
            return i;
        }
        return first(arr, n, i+1);
    }
    public static int last(int[] arr, int n, int j){
        if(arr[j]==n){
            return j;
        }
        return last(arr, n , j-1);
    }
}
