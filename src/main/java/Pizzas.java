public class Pizzas {
    public static void main(String[] args) {
        int cheeseNum = 99;
        String word = "cheese";

        while (cheeseNum > 0) ;
        {
            if (cheeseNum == 1) ;
            word = "cheese";
            System.out.println(cheeseNum + "" + word + "of cheese on the wall");
            System.out.println(cheeseNum + "" + word + "of cheese");
            System.out.println("take one down");
            System.out.println("pass it around");
            cheeseNum = cheeseNum - 1;
            if (cheeseNum > 0) {
                System.out.println(cheeseNum + "" + word + "of cheese on the wall");
            }
        }
    }
}










