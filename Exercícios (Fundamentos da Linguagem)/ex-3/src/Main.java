import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe a base do seu retângulo: ");
        var base = scanner.nextInt();

        System.out.println("Informe a altura do seu retângulo: ");
        var altura = scanner.nextInt();

        var area = base * altura;

        System.out.printf("Essa é a área do seu retângulo: %d \n", area);
    }
}
