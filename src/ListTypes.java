import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTypes {
    public static void main(String[] args) {

        List<Integer> liczby = new LinkedList<>();
        liczby.add(5); //dodaje element tablicy liczby
        liczby.add(10);
        liczby.add(15);
        liczby.add(15);
        liczby.add(15);


        liczby.remove(Integer.valueOf(15)); //usuwa pierwszą 15

        int liczba2 = liczby.get(2);
//        System.out.println(liczba2);
//        System.out.println(liczby);
//        System.out.println(liczby.size()); //wyswietla rozmiar tablicy

        printList(liczby);
    }

    static void printList(List<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
