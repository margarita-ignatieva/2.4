import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args){

        Figure[] figures = new Figure[random.nextInt(100)];
        for(Figure figure : figures){
            switch (random.nextInt(4)) {
                case 0:
                    figure = new Triangle();
                    break;
                case 1:
                    figure = new Square();
                    break;
                case 2:
                    figure = new Circle();
                    break;
                default:
                    figure = new Trapezium();
            }
            figure.setColor(randomColor(Colors.class));
            figure.setSpecialFeature(Math.floor(random.nextDouble() * 100));
            System.out.println(figure.draw());
        }
    }

    public static <T extends Enum<?>> T randomColor(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
