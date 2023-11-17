import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> ints = new LinkedList<>();
        int k = 0;
        System.out.println("Give ints: ");

        try (Scanner scanner = new Scanner (System.in)) {
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (ints.contains(val)) {
                    for (int i = 0; i < ints.toArray().length; i++)
                        if (ints.get(i) == val)
                            k = i;
                    ints.addFirst(ints.remove(k));
                }
                else
                    ints.addFirst(val);
            }

            for (int v : ints)
                System.out.print(v + " ");
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            System.exit (1);
        }
    }
}