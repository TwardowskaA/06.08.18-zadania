public class WrapperTypes {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("5");
//        Integer integer1 = 5;

        int x = integer1.intValue(); // zwraca wartosc opakowaną w integer1
//        int x = integer1

        Double aDouble = Double.valueOf(4.5);

        System.out.println(Integer.MAX_VALUE);
    }
}
