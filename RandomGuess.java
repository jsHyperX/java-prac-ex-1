import java.io.*;
import java.util.*;


public class RandomGuess {

    public  BufferedReader in;

    public RandomGuess(){
        this.in = new BufferedReader(new InputStreamReader(System.in));
    }

    public void solve() throws IOException {
        BufferedReader in  = this.in;
        System.out.println("please enter to set the limit: ");
        int min = Integer.parseInt(in.readLine());
        int max = Integer.parseInt(in.readLine());

        System.out.println("let's begin the hunt!!");
        Random rd = new Random();               //  creating object of "Random" class
        int tar = min+rd.nextInt(max-min+1);            // setting the limits of number to be generated
        boolean flag=false;
        System.out.println("please enter a number between "+min+" and "+max + " insclusively");
        while(!flag) {
            int val = Integer.parseInt(in.readLine());
            if(val>tar) System.out.println("number guessed is more than original number");
            else if(val<tar) System.out.println("number guessed is less than original number");
            else {
                System.out.println("number guessed matches the original number");
                flag=true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        RandomGuess rg = new RandomGuess();
        rg.solve();

    }
}
