public class Trapezium extends Figure{

    private double height;
    private double median;

    @Override
    public String draw() {
        return "Фигура: трапеция, площадь: " + area() + " кв. ед., длина высоты: "
                + height +" ед., цвет: " + getColor();
    }

    @Override
    public double area() {
        median = Math.random() * 100;
        return Math.floor(height * median * 100) / 100;
    }

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public void setSpecialFeature(double height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color.name();
    }
}
