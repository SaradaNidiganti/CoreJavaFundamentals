import java.util.Arrays;

public class SwapArrayList {
    public static void main(String[] args){
        //using swap write a logic to print even and odd next like eg: {1,2,4,3,6,7,5} to (2,4,6,1,3,5,7}
        int[] array = {1,2,4,3,6,7,5};
        for(int i=0;i<=array.length-1;){
            if(i!=0 && (array[i]%2==0 && array[i-1]%2 != 0)){
                int odd = array[i-1];
                array[i-1] = array[i];
                array[i] = odd;
                i=i-1;
            }else{
                i++;
            }
        }
        Arrays.stream(array).forEach(ele ->
                System.out.print(ele));
    }
}
