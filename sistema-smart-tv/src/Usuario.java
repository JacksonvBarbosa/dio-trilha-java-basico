public class Usuario {
    public static void main(String[] args) {
        

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(4);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);
    }
}
