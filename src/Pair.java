public class Pair {
    private Object object1;
    private Object object2;

    public Pair(Integer object1, Integer object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Pair(Double object1, Double object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    public Object getObject2() {
        return object2;
    }

    public void setObject2(Object object2) {
        this.object2 = object2;
    }

    Pair pair = new Pair(5,10);
    Pair pair1 = new Pair(2.5,8.8);


}
