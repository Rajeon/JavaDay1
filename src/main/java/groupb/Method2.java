package groupb;

public class Method2 {
    public static void main(String[] args) {

        int[] g = {1,2,3,4,5};
        sqrt(g);
       // The square of x is the value obtained by multiplying x by itself.
//        int x = 5;
//        System.out.println(x*x);
////        int squareOfX = x*x;
//        System.out.println(Math.sqrt(81));
//        for (int x =0; x < 10; x++){
//            System.out.println();
//        }




//        countDown(5);




   }
   public static void sqrt(int[] numbers){
        for (int x = 0; x < numbers.length; x++)
            System.out.println(Math.sqrt(numbers[x]));
   }
//public static void countDown(int g){
//        for (int x=g; g > 0; g--)
//            System.out.println(g*g);
//}
    }

