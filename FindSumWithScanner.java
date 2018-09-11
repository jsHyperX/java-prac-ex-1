import java.util.*;

public class FindSumWithScanner {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter stream of inputs..");
        int sum=0;
        while(true) {
            if(inp.hasNextInt()) sum+=inp.nextInt();    //adding only if the input being read is integer
            else {
                System.out.println("total value of numbers till now: "+ sum);
                System.out.println("please enter a valid input");
                break;
            }
        }
        System.out.println("total sum value :"+sum);
    }
}
