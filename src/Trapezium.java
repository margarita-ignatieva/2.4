import java.util.Random;
public class Trapezium extends Figure{

    @Override
    public String draw() {
        return "Фигура: трапеция, площадь: " + area() + "кв. ед., длина высоты: "+ Trapezium.height() +" ед., цвет: " + Trapezium.color();
    }

    @Override
    public int area() {
        int area = (int)(Trapezium.sideA()+Trapezium.sideB())*Trapezium.height()/2;
        return area;
    }
    public static int sideA(){
        Random rand = new Random();
        int sideA = rand.nextInt(30);
        return sideA;
    }
    public static int sideB(){
        Random rand = new Random();
        int sideB = rand.nextInt(30);
        return sideB;
    }
    public static int height(){
        Random rand = new Random();
        int height = rand.nextInt(30);
        return height;
    }
}
