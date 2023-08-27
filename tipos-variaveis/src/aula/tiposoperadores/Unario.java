package aula.tiposoperadores;

public class Unario {
    public static void main(String[] args) {
        //Aplicados juntamente com operador aritmético
    //trabalhos incrementar, decrementar, inverter valores numéricos e booleanos.
    //conversores (+) - transforma um valor negativo em positivo
    //conversores (-) - transforma um valor positivo em negativo
    //incrementar (++) - incrementa o valor em 1 unidade
    //decrementar (--) - decrementa o valor em 1 unidade
    //Operador de negação (!) - utilizado em expressão lógica booleano

    /*int numero = 5;
    System.out.println(- numero);//imprimi negativo
    System.out.println(numero);//não mantem o negativo e imprimi como na declaraçã ooriginal

    numero = -numero;//deixa-lo negativo
    System.out.println(numero);//Agora imprimi negativo pois atribui o valor negativo a variavel

    numero = -(numero);
    System.out.println(numero);*/

    int numero1 = 5;
    int numero2 = 10;
    //x repetição para incrementar
    //numero1 = numero1 + 1;
    numero1++; //mesma representação da expressão acima
    //Pós-Incremento incrememta depois
    ++numero2;
    //Pré-Incremento incrementa antés
    System.out.println(numero1++);
    System.out.println(numero1);
    System.out.println(++numero2);
    System.out.println(numero2);

    //O decremento é o inverso ao invés de adicionar ele retira

    //Negação expressão booleana
    boolean verdadeira = true;

    System.out.println(!verdadeira);//resultado vai ser false mais não será armazenado na memória
    System.out.println(verdadeira);//o resultado será o valor declarado no escopo original

    verdadeira = !verdadeira;//agora sim a variavel será mudada para false e será gravado na memória
    System.out.println(verdadeira);//imprimi false

    //Ternário seria um IF mais tudo representado na mesma linha
    //<Expressão Condicional> ? <Caso condição seja true> :
    // <Caso condição seja false>

    int a, b;
    a = 6;
    b = 6;
    
    String resultado = a==b ? "verdadeiro" : "Falso";
    //após o atributo sempre será um expressaõ booleana após ? true e após : false

    System.out.println(resultado);

    //Relacionais (== - igual, != - diferente, > - maior, >= - maior ou igual)
    // (< - menor, <= - menor ou igual, )

    int num = 1;
    int num1 = 2;

    boolean simNao = num == num1;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);
    
    String nome1 = "Jackson";
    String nome2 = "Debora";
    String nome3 = new String("Debora");

    System.out.println(nome1 == nome2);
    System.out.println(nome2 == nome3);//Quando usamos objetos ou texto utilizamos o .equals()
    System.out.println(nome2.equals(nome3));

    //Lógicos (&& - AND, || - OR,)
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2){
        System.out.println("As duas condições são verdadeiras");
    } else if(condicao1 || condicao2){
        System.out.println("Uma das Condições é Verdadeira");
    }

    System.out.println("FIM!");
    
    }
}
