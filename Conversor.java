import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        double f;
        double c;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius.");
        c = s.nextDouble();
        f = (c * 9 / 5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + f);
    }
}
