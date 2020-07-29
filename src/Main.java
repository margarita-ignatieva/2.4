import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        String[] randArr= new String[rand.nextInt(100)];
        for(int i=0;i<randArr.length;i++){
            if(rand.nextInt(14)/4>2 & rand.nextInt(14)/4<3) {
                randArr[i]= new Triangle().draw();
            }
            if(rand.nextInt(14)/4>1 & rand.nextInt(14)/4<2) {
                randArr[i] = new Square().draw();
            }

            if(rand.nextInt(14)/4>0 & rand.nextInt(14)/4<1) {
                randArr[i] = new Circle().draw();
            }else{
                randArr[i] = new Trapezium().draw();
            }

            System.out.println(randArr[i]);
        }
    }
}}