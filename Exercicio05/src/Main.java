import java.util.Scanner;

public class Main {
    static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do numero para verificar o antecessor e sucessor");
        int numero = scan.nextInt();

        System.out.println("O antecessor " + (numero - 1));
        System.out.println("O sucessor " + (numero + 1));

        scan.close();
    }
}