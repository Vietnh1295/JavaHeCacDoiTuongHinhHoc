public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        Shape circle=new Circle(2);
        System.out.println(circle);
        Rectangle rectangle=new Rectangle(2,4);
        System.out.println(rectangle);
        Shape Square=new Square(10);
        System.out.println(Square);
    }
}
