public class letter_combination {
    static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        letter("24", "");
    }
    public static void letter(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        int a = ch - 48;
        String b = arr[a];
        for(int i=0; i<b.length();i++){
            letter(s.substring(1), ans+b.charAt(i));
        }
    }
}
