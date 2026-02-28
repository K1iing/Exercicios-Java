import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores para verificar se são iguais e realizar a soma");

        System.out.println("Digite o valor de A");
        int valorA = scan.nextInt();
        System.out.println("Digite o valor de B");
        int valorB = scan.nextInt();

        if (valorA == valorB) {
            int soma = valorA + valorB;
            System.out.println("Valores somados: " + soma);
        } else {
            System.out.printf("Os valores %s, %s não são iguais", valorA, valorB);
        }
        scan.close();
    }
}