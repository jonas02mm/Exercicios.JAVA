import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        int diasVividos = idade * 365;
        System.out.println("Você já viveu aproximadamente " + diasVividos + "dias");
        scanner.close();

    }
}