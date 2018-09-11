import java.io.*;

public class TomOrJerry {

    public static void solve(int num) {
        if(num>20 && num<30) {
            if(num%2==1) System.out.println("Tom");
            else System.out.println("NO");
        }
        else {
            System.out.println("please enter a valid number");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        solve(num);
    }
}
