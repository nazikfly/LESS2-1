public class Rectangle extends Figure{

    private int a;
    private int b;
    private  int c;

    public Rectangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void draw() {
        System.out.println("▲");

    }
}
