import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Digite o salário do funcionario : ");
        double salario = scanner.nextDouble();
        double reajuste =  salario * 0.07;
        double novoSalario = salario + reajuste;
        System.out.println(" O novo salário após o reajuste de 7% é de : R$ " + novoSalario);
        scanner.close();
    }
}