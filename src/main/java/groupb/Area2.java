package groupb;

public class Area2 {
    public static void main(String[] args) {
        Area2 wild = new Area2();
        wild.triangle();


    }
    public static void triangle(){
        double base = 50.5;
        double height = 10.5;
        double area =(base * height)/2;
        System.out.println("triangle is: " + area);
    }
}
