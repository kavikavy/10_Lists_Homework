import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        LinkedList <String> list = new LinkedList <> ();
        System.out.println("Please give me some strings: "); // message to the user
        try (Scanner scanner = new Scanner (System.in))
        {
            while (scanner.hasNext())
            {
                String val = scanner.next();
                if (val.equals("!"))
                    break;
                else {
                    list.add(val);
                }
            }

            System.out.println("Please give me some more strings: ");

            while (scanner.hasNext())
            {
                String val = scanner.next();
                if (val.equals("!"))
                    break;
                else {
                    for (String u : list)
                        if (u.equals(val))
                            System.out.println("hit");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
            System.exit (1);
        }
    }
}