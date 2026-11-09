import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in); //scanner é um objeto, daria para usar Scanner ao invés de var
        System.out.println("Olá, informe o seu nome");
        var nome = scanner.next(); //daria para usar String ao invés de var, scanner.next pelo que eu entendi é como se fosse um readline do php, ou seja ele vai ler a sua resposta

        System.out.println("Informe a sua idade"); //a diferença do println pro print é que o println ja coloca um /n automaticamente logo após finalizar a impressão
        var idade = scanner.nextInt(); //nextInt mesma coisa do next, porém para variáveis do tipo int

        System.out.println("Olá " + nome + " sua idade é: " + idade); //printando com println

        System.out.printf("Olá %s sua idade é: %s \n", nome, idade); //printando com printf se deve colocar /n e definir as variáveis

    }
}
