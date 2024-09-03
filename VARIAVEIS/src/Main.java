import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            //variáveis():

            var calculo = 1 + 2 - (3 * 2) / 5.0;
            System.out.println(calculo);
            calculo++;
            System.out.println(calculo);
            calculo--;
            System.out.println(calculo);

            //condicionais():
            var scanner = new Scanner(System.in);
            System.out.println("Digite sua idade.");
            var idade = scanner.nextLine();
            var idade = 18;
            if (idade >= 18 && idade <= 200)
            System.out.println("A pessoa é maior de idade.");
            else if (idade > 200)
                System.out.println("A pessoa é um vampiro.");
            else
                System.out.println("A pessoa é menor de idade.");


    }

    public static void variaveis(){

        System.out.println("Sistema iniciando...");

        var scan = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        var numero1 = scan.nextDouble();
        scan.nextLine();
        System.out.println(("Digite o número 2: "));
        var numero2 = scan.nextDouble();
        scan.nextLine();

        System.out.println(numero1 + numero2);

        String nome = "FIAP";
        System.out.println(nome);

        int numero = 10;
        System.out.println(numero + 10); /** int = inteiro **/

        double valor = 10.5;
        System.out.println(valor + 10); /** double = número inteiro **/

        long valorGrande = 100000000000L;  /** botar o L no final por ser número longo **/
        short valorPequeno = 10;

        char letra = 'A'; /** char = character. só um caracter e USAR ASPAS SIMPLES **/
        boolean condicao = true; /** só true ou false/ 0 e 1 **/

        /**declaração de variáveis**/
        int idade;

        /** inicialização de variáveis **/
        idade = 10;
        idade = 20;
        idade = 30;

        /** declaração e inicialização **/
        var idade2 = 10;

        System.out.println("Sistema finalizando...");


    }
}