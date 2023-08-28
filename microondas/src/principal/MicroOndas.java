package principal;
public class MicroOndas {

    //Variaveis
    public boolean incia = false;
    public boolean para = true;
    public boolean pausa = false;
    public boolean comeca = false;
    public double tempo = 0;

    //Métodos

    public void aumentar(){
        tempo++;
    }
    
    public void diminuir(){
        tempo--;
    }

    public double prepararPipoca(){
        comeca = true;
        return tempo = 3;
    }

    public double prepararFrango(){
        comeca = true;
        return tempo = 7;
    }

    public double prepararArroz(){
        comeca = true;
        return tempo = 4;
    }

    public double descongelar(){
        comeca = true;
        return tempo = 10;
    }


}
