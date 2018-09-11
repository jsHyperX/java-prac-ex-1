import java.io.*;

public class RepeatLastNChar {

    /**
     * THis function repeats last n characters of input string n-times
     * @param num: input string
     * @param n : repetition factor
     */
    public static void solve(String num,int n) {
        String suff="";
        int l = num.length();
        for(int i=l-n;i<l;i++) suff+=num.charAt(i);
        String s=num;
        for(int i=0;i<n;i++) s+=suff;
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        int n = Integer.parseInt(in.readLine());
        solve(num,n);
    }
}
