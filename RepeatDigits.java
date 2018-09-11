import java.io.*;

public class RepeatDigits {

    /**
     * This function repeats every number i upto a given number n i-times
     * @param num: input number
     */
    public static void solve(int num) {
        for(int i=1;i<=num;i++) {
            for(int j=0;j<i;j++) System.out.print(i+" ");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        solve(num);
    }
}
