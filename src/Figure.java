public abstract class Figure {
    protected Colors color;

    public abstract String draw();

    public abstract double area();

    public abstract void setColor(Colors color);

    public abstract void setSpecialFeature(double feature);

    public abstract String getColor();
}
