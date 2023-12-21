public class RevString {
    public static void main(String[] args) {
        String str="Java is my God";
        String rev="";
        char[] strCharArry = str.toCharArray();
        for(int i=strCharArry.length-1;i>=0;i--){
               rev = rev+strCharArry[i];
        }
        System.out.println("Reverse String: "+rev);

        String word = "Sarada";
        String revWord = "";
        int wordLen = word.length();
        for(int i = wordLen-1;i>=0;i--){
            revWord = revWord+word.charAt(i);
        }
        System.out.println("Reverse word: "+revWord);

    }
}
