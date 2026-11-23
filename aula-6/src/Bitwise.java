public class Bitwise {
    public static void main(String[] args){
        var num1 = 9;
        var num2 = 2;
        var binario1 = Integer.toBinaryString(num1); //pelo que eu entendi isso serve para pegar um valor INT e transformar em binário
        var binario2 = Integer.toBinaryString(num2);
        var resultado = num1 >>> num2;
        var resultadoBinario = Integer.toBinaryString(resultado);

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s >>> %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        /*
        OPERAÇÕES COM O OU "BURRO"

        var resultado = num1 | num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s | %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        OPERAÇÕES COM O AND

        var resultado = num1 & num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s & %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        OPERAÇÕES COM O XOR

        var resultado = num1 ^ num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s ^ %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        OPERAÇÕES COM O COMPLEMENTO

        var resultado = ~num1

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf(" ~%s = %s (representação binária %s) \n", num1, resultado, resultadoBinario);

        OPERAÇÕES COM <<

        var resultado = num1 << num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s << %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        OPERAÇÕES COM >>

        var resultado = num1 >> num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s >> %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        OPERAÇÕES COM >>>

        var resultado = num1 >>> num2

        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", num1, binario1);
        System.out.printf("Segundo número da operação %s (representação binária %s) \n", num2, binario2);
        System.out.printf("%s >>> %s = %s (representação binária %s) \n", num1, num2, resultado, resultadoBinario);

        */
    }

    /*
    110 = 6 em binário
    101 = 5 em binário

    0 = false
    1 = true

    basicamente a operação que foi feita acima com o ou "burro", funciona da seguinte forma, como o ou "burro"
    só precisa de uma afirmação verdadeira, ele vai verificar até achar ela, então no caso 110 e 101
    no primeiro valor (unidade) ele verificou o 1 do 101 e adicionou ao 110 ficando 111, após isso ele
    fez a mesma operação no segundo valor (dezena) e como o 1 da dezena já é true ele nem verificou a
    dezena do 101 e por último ele verificou o terceiro valor (centena) que é 1 em ambos, então ele manteve o 1
    por conta disso o resultado ficou 111

    LOGO:

    UNIDADES: 110 = 0 (unidade) 101 = 1 (unidade), nesse caso o 101 venceu pelo 1 ser verdadeiro então 111

    DEZENAS: 110 = 1 (dezena) 101 = 0 (dezena), nesse caso o 110 venceu pelo 1 ser verdadeiro então 111

    CENTENAS: 110 = 1 (centena) 101 = 1 (centena), nesse caso ambos são verdadeiros então 111

    última questão, se tiver 0 com 0 na mesma casa o ou "burro" não tem escolha a não ser retornar falso
    por exemplo 001 e 101, ficaria: 101

    agora no caso do AND, ele só precisa de um valor falso para retornar falso, ou seja 110 e 101
    o resultado seria: 100

    no caso do XOR, ele retorna false (0) para valores iguais e verdadeiro (1) para valores diferentes, ou seja
    100 e 101 o resultado seria: 101

    no caso do complemento (~), ele nega os valores, então se o valor for false (0) ele vai retornar true (1), ou seja
    110, o resultado seria: 001 (OBS: na impressão do complemento ele coloca os números a esquerda também, no caso do
    nosso número 001 seria tudo 0 na esquerda, então como ele nega ficaria tudo 1), se pedirmos um número negativo no
    complemento ele sempre virará um número positivo e vice-versa


    OPERADORES DE DESLOCAMENTO

    << serve para deslocar bits para a esquerda, ou seja 1001 ficaria 100100, esses 2 zeros apareceram pois a esquerda
    de todo numero em binário tem 0, logo o número 1001 foi deslocado para a esquerda assim os 2 zeros que estariam na
    esquerda foram para a direita do 1001 (nesse caso ele deslocou apenas 2 casas, pois a variável num1 foi declarada
    com o valor 2, mas pode-se deslocar quantas casas forem requeridas pelo usuário (empurra para a esquerda e sempre
    completa com 0)


    >> tem a mesma funcionalidade do <<, a diferença é que o >> desloca para a direita ao invés da esquerda, então por
    exemplo 1001 ficaria 0110 (2 casas para direita pois o num2 vale 2), o 01 foi para a direita ficando 0110, (empurra
    para a direita e verifica, se o número é positivo, completa com 0, se é negativo completa com 1) 1001 = 1111


    >>> funciona exatamente igual ao <<, porém para a direita
   */
}
