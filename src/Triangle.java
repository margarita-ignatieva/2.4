import java.util.Random;
public class Triangle extends Figure{

    @Override
    public String draw() {
        System.out.println("Фигура: треугольник, площадь: " + area() + "кв. ед., длина гипотенузы: "+ Triangle.hypotenuse() +" ед., цвет: " + Triangle.color());
        return "0";
    }

    @Override
    public int area() {
        double radiansA = Math.toRadians(Triangle.degreeA());

        double area = Triangle.hypotenuse()*Triangle.hypotenuse()*Math.sin(radiansA);
        return (int)area;
    }
    public static int hypotenuse(){
        Random rand = new Random();
        int hypotenuse = rand.nextInt(30);
        return hypotenuse;
    }
    public static double degreeA(){
        Random rand = new Random();
        double degreeA = rand.nextDouble()*90;
        return degreeA;
    }
}