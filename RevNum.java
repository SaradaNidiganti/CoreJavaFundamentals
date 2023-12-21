public class RevNum {
    public static void main(String[] args) {
        //general algorithm
        int num = 123;
        int rev=0;
        while (num!=0){
           rev = (rev*10)+(num % 10);
           num = num/10;
        }
        System.out.println(rev);
        //by using stringbuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(345));
        System.out.println(sb.reverse());
    }
}
