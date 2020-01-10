public class Main {
    public static void main(String[] args) {
     String [] wordListOne = {"Drake", " Josh", "Jermaine"};
     String [] wordListTwo = {"Audi", "Mercedes", "Benz"};
     String [] wordListThree = {"Josh", "Peck", "Cosgrove"};
     int oneLength = wordListOne.length;
     int twoLength = wordListTwo.length;
     int threeLength = wordListThree.length;
     int Rand1 = (int) (Math.random());
     int Rand2 = (int) (Math.random());
     int Rand3 = (int) (Math.random());
     String phrase = wordListOne[Rand1] + " " + wordListTwo[Rand2]  + " " + wordListThree [Rand3];
     System.out.println("What we need is a " + phrase);
     Donuts Glaze = new Donuts();
     System.out.println(Glaze.multiplyByTwo(7));



    }
}
