public class RevEachWord {
    public static void main(String[] args) {
        String str = "I love Java Programme";
        String[] strArray = str.split(" ");
        System.out.println("The total words count: "+strArray.length);
        String revStr = " ";
        for (String word :
                strArray) {
            String revWord =" ";
            System.out.println(word);
            for (int i = word.length()-1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }
            System.out.println("Each Reverse Words: "+" "+revWord);
            //by using StringBuilder or StringBuffer class
//            StringBuffer sb=new StringBuffer(word);
//            sb.reverse();
//            revStr = revStr+sb+" ";
            revStr=revStr+revWord+" ";
        }

        System.out.println("Complete Reverse String is : "+revStr);
    }
}
