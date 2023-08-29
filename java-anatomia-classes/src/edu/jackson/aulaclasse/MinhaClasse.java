package edu.jackson.aulaclasse;
public class MinhaClasse {
    

    public static void main(String [] args) {
        String primeiroNome = "Jackson";
        String segundoNome = "Ventura";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
