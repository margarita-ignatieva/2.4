public class Square extends Figure{
    private double side;

    @Override
    public String draw() {
        return "Фигура: квадрат, площадь: " + area() + " кв. ед., длина стороны: "
                + side + " ед., цвет: " + getColor();
    }

    @Override
    public double area() {
        return Math.floor(Math.pow(side, 2) * 100) / 100;
    }

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public void setSpecialFeature(double side) {
        this.side = side;
    }

    @Override
    public String getColor() {
        return color.name();
    }
}
