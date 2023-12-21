public class StrPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        boolean palindrome = true;
        char[] strChar = str.toLowerCase().toCharArray();
        int pointer = strChar.length-1;
        for(int i=0;i<pointer;i++){
            if(i>=pointer)
                break;
            if(strChar[i] != strChar[pointer]){
                palindrome = false;
                break;
            }
            pointer--;
        }
        System.out.println(palindrome);
        }
}
