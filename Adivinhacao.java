import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) throws Exception {
        //Primeiro de tudo, vamos inserir as nossas variáveis:

        //Variável da tentativa:
        int tentativa;

        //Variável que contém a resposta correta:
        int resposta = 10;

        /*
         * Vamos então criar a nossa função de Scanner!
         * Com ela podermos receber inputs do usuário.
         */
        Scanner input = new Scanner(System.in);
        
        /*
         * Ok, já conseguimos receber os dados do usuário mas e agora?
         * Como ele digitará um valor sem saber o que digitar?
         * Vamos então lhe fazer uma charada!
         */
        System.out.println("Um homem vai ao mercado a pe.");
        System.out.println("No caminho, ele ve 10 arvores a sua esquerda.");
        System.out.println("No caminho de volta, ele ve 10 arvores a sua direita.");
        System.out.println("Quantas arvores o homem viu no total?");

        //Vamos pedir que o usuário digite um valor:
        System.out.println("Digite sua resposta: ");

        //Atenção! Agora iremos recolher um dado de entrada do usuário:
        tentativa = input.nextInt();

        /*
         * Ótimo, já fizemos a charada e já pedimos que o usuário insira uma resposta.
         * E agora? O que fazer se ele não acertar?
         * Para resolver isso criaremos um laço de repetição!
         * Ele forçará o usuário a acertar o valor correto!
         */

        //Enquanto a tentativa for diferente da resposta correta
        while(tentativa != resposta){            
            
            //Se a tentativa for maior do que a resposta correta:
            if(tentativa > resposta){
                System.out.println("Que pena, voce errou");
                System.out.println("Tente um pouco menos desta vez...");
            }

            //Qualquer valor menor do que a resposta correta:
            else{
                System.out.println("Que pena, voce errou");
                System.out.println("Tente um pouco mais desta vez...");
            }
            
            //Vamos agora pedir que o usuário insira outra resposta:
            System.out.println("Digite sua resposta");
            tentativa = input.nextInt();

            /*
             * Ótimo, agora já temos duas condições que irão forçar o usuário a digitar o valor correto:
             *  
             *  1º- Se o valor for maior do que a resposta
             *  2º- Se o valor for menor do que a resposta
             * 
             * Para sair deste laço de repetição o uauário deve obrigatóriamente digitar a resposta correta!
             */
        }

        //Fechando a função Scanner
        input.close();

        //Caso o usuário acerte a resposta o laço de repetição irá terminar e imprimir um parabéns por ter acertado:
        System.out.println("Parabens, voce acertou!");
        System.out.println("A resposta sera 10, ja que as arvores que ele viu na ida, sao as mesmas que ele viu na volta");

        //O usuário só irá ver esta mensagem caso ele acerte a resposta.
    }
}
