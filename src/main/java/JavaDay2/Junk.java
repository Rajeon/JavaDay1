package JavaDay2;


class Main {

    public static void main(String[] args) {

        System.out.println("We all know this by now");
        int x = 230;
        double y = (double) x;
        System.out.println(y);

        String firstName = "Kool";
        String lastName = "G Rap";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wacka").append("Flocka");
        System.out.println(stringBuilder);

        int age = 17;
        String result = (age < 18) ? "Cannot party with us." : "Old enough to party";
        System.out.println(result);

        if (age < 18) {
            System.out.println("Cannot party with us");
        } else {
            System.out.println("Old enough to party");

            int rating = 1;

            switch (rating) {
                case 1:
                    System.out.println("Drake");
                    break;
                case 2:
                    System.out.println("J.cole");
                    break;
                case 3:
                    System.out.println("Kendrick");
                    break;
                default:
                    System.out.println("Wayne");
                {
                }
            }
        }
    }
}
