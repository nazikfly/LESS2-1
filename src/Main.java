import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Krug", 10);
        Triangle triangle = new Triangle("Primoygolnik", 4, 7);
        Square square = new Square("Kvadrat", 8);
        Rectangle rectangle = new Rectangle("Triugolnik", 3, 4, 5);
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Bagira");

        //polimorfizm
        // Figure[] figures = {circle, square,rectangle, triangle};
        Drawable[] drawables = {circle, square, rectangle, triangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            //instanceof  proverka  yvlyetciy li?
            if (drawables[i] instanceof Figure) {
                // privedenya tipov
                System.out.println(((Figure) drawables[i]).getName() + "=> perimetr" +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal ){
                System.out.println(((Animal) drawables[i]).getName());
            }
                drawables[i].draw();
            }

            //  for (int i = 0; i < figures.length; i++) {
            //   System.out.println(figures[i].getName() + "=> perimetr" + figures[i].calculatePerimeter());
            //  figures[i].draw();

            //  System.out.println(circle.getName()+"->perimetr" +circle.calculatePerimeter());
            //  System.out.println(square.getName()+"->perimetr" +square.calculatePerimeter());
            //System.out.println(triangle.getName()+"->perimetr" +triangle.calculatePerimeter());
            //System.out.println(rectangle.getName()+"->perimetr" +triangle.calculatePerimeter());
        }
        //   for (Figure figure:figures){
        //    System.out.println(figure.getName() + "=> perimetr" + figure.calculatePerimeter());
    }


