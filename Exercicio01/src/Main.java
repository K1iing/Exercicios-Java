import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double valorA = scan.nextDouble();

        System.out.println("Digite o valor de B");
        double valorB = scan.nextDouble();

        System.out.println("Digite o valor de C");
        double valorC = scan.nextDouble();

        double soma = valorA + valorB;

        if(soma < valorC) {
            System.out.printf("A soma de A e B é menor do que o Valor C. Valor: %.2f", soma);
        }else
            System.out.printf("A soma de A e B é maior do que o Valor C. Valor: %.2f", soma);

        scan.close();
    }
}