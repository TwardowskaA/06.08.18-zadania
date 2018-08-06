public class PairTest {
    public static void main(String[] args) {

        Pair pair1 = new Pair(5,10);
        Pair pair2 = new Pair(2.5,8.8);

        Object first1 = pair1.getObject1();
        Object first2 = pair2.getObject1();

        Integer firstInt = (Integer)first1;
        Double firstDouble = (Double)first2;
        double sum = firstInt + firstDouble;

    }
}
