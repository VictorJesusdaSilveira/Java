import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa: ");
        var nome1 = scanner.next();

        System.out.println("Informe a idade da primeira pessoa");
        var idade1 = scanner.nextInt();

        System.out.println("Informe o nome da segunda pessoa: ");
        var nome2 = scanner.next();

        System.out.println("Informe a idade da segunda pessoa");
        var idade2 = scanner.nextInt();

        var diferenca = idade1 - idade2;

        System.out.printf("Essa é a diferença de idade entre %s e %s: %d \n", nome1, nome2, diferenca);
    }
}
