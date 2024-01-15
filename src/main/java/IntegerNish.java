public class IntegerNish implements Cloneable{

    private int x;

    public IntegerNish(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
