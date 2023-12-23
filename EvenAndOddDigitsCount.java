public class EvenAndOddDigitsCount {
    public static void main(String[] args) {
        int num=123456;
        int evnCount=0;
        int oddCount=0;
        int rem;
        while (num>0){
            rem = num%10;
            if(rem%2==0){
                evnCount++;
            }else{
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("Total even digit count is: "+evnCount);
        System.out.println("Total odd digit count is: "+oddCount);
    }
}
