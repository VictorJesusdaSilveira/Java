import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número!");
        var num1 = scanner.nextInt();

        System.out.println("Informe o segundo número!");
        var num2 = scanner.nextInt();

        /*
            A %s são as variáveis string, %d são as de tipo int, %f para float/double,
            %2.f para decimais com 2 casas ou mais, %n para quebra de linha semelhante ao
            \n
        */

        //Soma
        System.out.printf("%d + %d = %d %n", num1, num2, num1 + num2);

        //Subtração
        System.out.printf("%d - %d = %d %n", num1, num2, num1 - num2);

        //Multiplicação
        System.out.printf("%d * %d = %d %n", num1, num2, num1 * num2);

        /*
            O problema nessa aplicação é que por estarmos usando a expressão scanner.nextInt(), na divisão mesmo que o
           resultado certo seja um número quebrado, ele retornará o número inteiro mais próximo, logo para corrigirmos
           teríamos qu mudar para scanner.nextFloat, porém como é só um aprendizado não mudarei
       */

        //Divisão
        System.out.printf("%d / %d = %d %n", num1, num2, num1 / num2);

        /*
            Como usamos a % para definir os tipos das variáveis no printf, para usar a % como o operador de "Resto" ou
            "Módulo", devemos colocar ela duplicada dentro do printf
        */

        //Resto
        System.out.printf("%d %% %d = %d %n", num1, num2, num1 % num2);


        /*
            Alguns outros operadores:
            Math.sqrt(num1) é para tirar a raiz quadrada do valor da variável num1
            Math.pow(num1, 2) é para fazer a potência, nesse caso seria a variável num1 elevado ao quadrado
        */
    }
}
