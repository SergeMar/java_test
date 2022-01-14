package pft;

public class Square {

    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double area(){
        return l*l;
    }
}
