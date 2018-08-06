import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cwiczenie {
    public static void main(String[] args) {

        List<String> napis = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kolejny element (lub stop):");
        String a = scan.nextLine();

        while (!(a.equals("stop"))) {
            napis.add(a);
            System.out.println("Podaj kolejny element (lub stop):");
            a = scan.nextLine();
        }
        System.out.println(napis.size());

        for (int i = 0; i < napis.size(); i++) {
            System.out.println(napis.get(i));
        }
    }
}
