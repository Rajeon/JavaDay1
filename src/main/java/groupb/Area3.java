package groupb;

public class Area3 {
    static float findPerimeter(float r, float a, float y) {
        return (r + a + y);
    }

    public static void main(String[] args) {
        float r = 21;
        float a = 21;
        float y = 10;

        System.out.println(findPerimeter(r,a,y));
    }


}
