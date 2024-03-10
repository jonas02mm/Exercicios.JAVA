import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print(" Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();
        double valorReal = valorDolar * 4.95;
        System.out.println(valorDolar + " Dólares é igual a R$ " + valorReal);
        scanner.close();
    }
}