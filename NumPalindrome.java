import java.util.Scanner;

public class NumPalindrome {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=scr.nextInt();
        int orgNum=num;
        int rev = 0;
        while (num !=0 ){
            rev = rev *10+num%10;
            num=num/10;
        }
        if(rev==orgNum){
            System.out.println("Entered number is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
