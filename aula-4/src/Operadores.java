import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        var scanner = new Scanner(System.in); //operador de atribuição padrão

        System.out.println("Qual a sua idade?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        //var canDrive = age > 17; //maior, se colocar o = na frente fica maior ou igual >=
        //var canNotDrive = age < 18; //menor, se colocar o = na frente fica menor ou igual <=
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16); //operador "ou" e o operador "and"
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);


        //OUTRO TESTE
        //System.out.println("Quanto é 2 + 2?");
        //var result = scanner.nextInt();
        //var isRight = result == 4; //operador de igualdade padrão
        //var isWrong = result != 4; operador de diferença padrão
        //System.out.printf("O resultado é 4, você errou? (%s) \n", !isRight); //essa exclamação na frente de uma variável booleana serve para inverter o seu valor, ou seja se é true, vai ser false

    }
}
