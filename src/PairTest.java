public class PairTest {
    public static void main(String[] args) {

        Pair<Integer, Integer> pair1 = new Pair<>(5,10);
        Pair<Double, Double> pair2 = new Pair<>(2.5,8.8);
        Pair<String, Double> pair3 = new Pair<>("abc",8.8);

        Integer first1 = pair1.getObject1();
        Double  first2 = pair2.getObject1();


        double sum = first1 + first2;
        System.out.println(sum);

    }
}
