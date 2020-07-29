import java.util.Random;
public abstract class Figure {
    public abstract String draw();
    public abstract int area();
    public static String color(){
        String[] colors={"transparent","white", "black", "yellow","black", "green", "blue", "red","pink"};
        Random r=new Random();
        return colors[r.nextInt(colors.length)];
    }
}

