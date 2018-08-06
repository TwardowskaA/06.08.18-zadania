import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        String a = scan.nextLine();
        String b = scan.nextLine();


        Integer num1 = Integer.valueOf(a);
        Integer num2 = Integer.valueOf(b);

        int num3 = num1;
        int num4 = num2;

        double sum = num3 + num4;
        System.out.println(sum);
    }
}
