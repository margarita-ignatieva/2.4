import java.util.Random;
public class Square extends Figure{

    @Override
    public String draw() {
        System.out.println( "Фигура: квадрат, площадь: " + area() + "кв. ед., длина стороны: "+ Square.side() +" ед., цвет: " + Square.color());
        return "0";
    }

    @Override
    public int area() {
        int area = Square.side()*Square.side();
        return area;
    }
    public static int side(){
        Random rand = new Random();
        int side = rand.nextInt(30);
        return side;
    }
}
