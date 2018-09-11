import java.io.*;

public class VowelOrConsonant {

    /**
     * function to check which characters of the string input are vowels or consonants
     * @param num : Input String
     */
    public static void solve(String num) {
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print("Vowel");
            else
                System.out.print("Consonant");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        solve(num);
    }
}
