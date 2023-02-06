import java.util.Scanner;

public class Calculator {
    private static double result;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Tippe eine Zahl ein: ");
        double num1 = input.nextDouble();
        System.out.println("Gebe einen Operator ein: ");
        String eingabe = input.next();
        System.out.println("Tippe eine Zahl ein: ");
        double num2 = input.nextDouble();

        switch(eingabe){
            case "+":
                result = num1 + num2;
                System.out.println("Die Zahlen " + num1 + eingabe + num2 + " ergeben " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Die Zahlen " + num1 + eingabe + num2 + " ergeben " + result);
                break;

            case "/":
                result = num1 / num2;
                System.out.println("Die Zahlen " + num1 + eingabe + num2 + " ergeben " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Die Zahlen " + num1 + eingabe + num2 + " ergeben " + result);
                break;

            default: System.out.println("Fehler beim ausführen deiner Rechnung.");

        }

    }
}
