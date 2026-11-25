import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var nome = scanner.next();

        System.out.println("Informe a sua idade: ");
        var idade = scanner.nextInt();

        System.out.printf("Olá %s, você tem %d anos! \n", nome, idade);
    }
}
