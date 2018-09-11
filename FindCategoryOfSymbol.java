import java.io.*;

public class FindCategoryOfSymbol {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a character");
        char a = in.readLine().charAt(0);
        if (65 <= a && a <= 90)  //ascii values in uppercase
            System.out.println("Given character is in uppercase");
        else if (97 <= a && a <= 122)   ///ascii values in lower case
            System.out.println("Given character us in lowercase");
        else if (48 <= a && a <= 57)   //for digits
            System.out.println("Given character is digit");
        else
            System.out.println("Given character is a special symbol");
    }
}
