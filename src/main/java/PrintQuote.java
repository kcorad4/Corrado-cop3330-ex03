
import java.util.Scanner;

public class PrintQuote {

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the qoute?");
        String qoute = sc.nextLine();
        System.out.println("who said it?");
        String name = sc.nextLine();

        System.out.println(name + " says, \"" + qoute +"\"");
    }
}
