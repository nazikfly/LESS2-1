public class Triangle extends Figure {

    private int a;
    private int b;

    public Triangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculatePerimeter() {
        return  (a+b)*2;
    }

    @Override
    public void draw() {
        System.out.println("⬜");

    }
}
