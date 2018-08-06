import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>(100_000);
        liczby.add(5); //dodaje element tablicy liczby 
        liczby.add(10);
        liczby.add(15);
        liczby.add(15);
        liczby.add(15);

        liczby.remove(Integer.valueOf(15)); //usuwa pierwszą 15

        int liczba2 = liczby.get(2);
        System.out.println(liczba2);
        System.out.println(liczby);
        System.out.println(liczby.size()); //wyswietla rozmiar tablicy
    }
}
