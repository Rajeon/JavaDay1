package Main;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(squares());
    }

    public static String squares(){
        String response = "";
        for (int x = 1; x < 11; x++){
            response += x * x + "\n";
        }
        return response;
    }
}


