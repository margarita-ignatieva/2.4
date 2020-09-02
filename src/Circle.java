public class Circle extends Figure {
    private double radius;

    @Override
    public String draw() {
        return "Фигура: круг, площадь: " + area() + " кв. ед., длина радиуса: "
                + radius + " ед., цвет: " + getColor();
    }

    @Override
    public double area() {
        return Math.floor(Math.pow(radius, 2) * Math.PI * 100) / 100;
    }

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public void setSpecialFeature(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color.name();
    }

}
