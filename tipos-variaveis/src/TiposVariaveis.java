public class TiposVariaveis {
    public static void main(String[] args) {
        //Pequisar
        //Tipos primitivos
        //Classe String que representa texto na aplicação


        //Tipos de conveções
        byte idade = 39;
        short ano = 2023;
        int cep = 23478298; //Caso comece com 0 pode ocorrer erro de compilação ai usar tipo String
        long cpf = 38493858393l; //Colocar o L no final. Se começar com 0 irá dar erro então usar tipo String
        float pi = 3.14F;//Colocar o f no final para indicar que é float
        double salario = 1623.90;
        
        //Cuidado ao fazer alguns tipos de conversão pode ocorrer problemas de compatibilidade
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;
        /*Esse problema ocorre por que o short nesse caso
         * Não poderia caso o número inteiro fosse definido com 
         * um limite maior que é suportado pelo short
         * com isso o java como é tipado ele não deixa isso ocorrer
         * dando a opção de cast que seria forçar um tipo maior ser
         * convertido para um tipo menor usando esse comando
         * short numeroCurto2 = (short) numeroNormal;
         * o numeroNormal que é está sendo forçado a ser convertido short
         */

         //Valores que nunca poderar mudar(Constantes)
        // usamos a palavra reservada final em seguido do tipo e a definição deve estar em CAIXA ALTA
        //Por convenção escrevemos o nome da variavel com letra maiúscula
        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI = 10.2; o VALOR NÃO PODER MUDADO POR CAUSA DA PALAVRA RESERVADA final

        System.out.println(VALOR_DE_PI);
    }

}
