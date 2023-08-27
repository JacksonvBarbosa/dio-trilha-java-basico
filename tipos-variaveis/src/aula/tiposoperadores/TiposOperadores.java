package aula.tiposoperadores;

import java.sql.Date;

public class TiposOperadores {
    public static void main(String[] args) {
        //Atriubuição (=) serve para iniciar um valor de uma varivael ou modificar esse mesmo
        /*String nome = "Jackson";
        int idade = 39;//Inicio com um nome
        nome = "Debora";//Mais também nesse caso mudar para outro tipo de nome
        idade = 35;

        double peso = 65.4;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date(); - Iniciali\a um objeto de uma determinada classe com o new
        
        //Aritméticos (+ adição, - subtração, * multiplicação, / divisão)
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //Obter o resto da divisão
        double resultado = (10*7) + (20/4);

        //concatenação de texto usa-se quando queremos juntar palavras
        String nomeCompleto = "Linguagem" + "Java";
        //o resultado seria LinguagemJava*/

        //concatenando numeros e textos
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    }
    
    
}
