import java.util.Random;

public class Circle extends Figure {

    @Override
    public String draw() {
        return "Фигура: круг, площадь: " + area() + "кв. ед., длина радиуса: " + Circle.radius() + " ед., цвет: " + Circle.color();
    }

    @Override
    public int area() {
        int area = Circle.radius() * Circle.radius()*(int)Math.PI;
        return area;
    }

    public static int radius() {
        Random rand = new Random();
        int side = rand.nextInt(30);
        return side;
    }
}
