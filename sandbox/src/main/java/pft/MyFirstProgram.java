package pft;

public class MyFirstProgram {
    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Sergey");
        Square s = new Square(5);
        s.setL(6);
        System.out.println("Площадь квадрата со стороной " + s.getL() + " равна " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.getA() + " и " + r.getB() + " равна " + r.area());
    }

    public static void hello(String hi) {
        System.out.println("Hello, " + hi);
    }
}
