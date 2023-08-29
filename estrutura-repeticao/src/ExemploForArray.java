public class ExemploForArray {

    public static void main(String[] args) {

        String frutas[] = { "Abacaxi", "Banana", "Maça", "Melão", "Uva", "kiwi", "Abacate", "Melancia", "Laranja", "Limão", "Jabuticaba", "Pera", "Maracuja", "Cacau", "Graviola" };

        /*for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }*/

        // Forma abreviada
        //DOIS pontos indica que a cada iteração os alunos será adicionado a aluno atéo final do array
        for (String fruta : frutas) {
            if (fruta.equals(frutas[2])){
                continue;
            }
                
            System.out.println("Nome da fruta é " + fruta);
        }

    }
}
