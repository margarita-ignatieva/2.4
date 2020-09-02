public class Triangle extends Figure{

    private double height;
    private double base;

    @Override
    public String draw() {
        return "Фигура: треугольник, площадь: " + area() + " кв. ед., высота треугольника: "
                + height +" ед., цвет: " + getColor();
    }

    @Override
    public double area() {
        base = Math.random() * 100;
        return Math.floor(height * base / 2 * 100) / 100;
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
