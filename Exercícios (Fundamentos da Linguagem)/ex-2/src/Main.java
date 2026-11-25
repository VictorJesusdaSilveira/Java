import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do primeiro lado do quadrado: ");
        var lado1 = scanner.nextInt();

        System.out.println("Informe o tamanho do segundo lado do quadrado: ");
        var lado2 = scanner.nextInt();

        var area = lado1 * lado2;

        System.out.printf("Essa é a área do seu quadrado: %d \n", area);

    }
}
