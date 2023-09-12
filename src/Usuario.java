public class Usuario {
    public static void main(String [] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Inicialmente:");
        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Qual o volume registrado? "+smartTv.volume);
        System.out.println("Qual o canal registrado? "+smartTv.canal);

        
        System.out.println("Neste momento:");
        smartTv.ligar ();
        if (smartTv.ligada ==true){
            System.out.println("Novo Status -> TV Ligada? Sim");
        }
        
        smartTv.desligar ();
        if (smartTv.ligada ==false){
            System.out.println("Novo Status -> TV Ligada? Não");
        }
        smartTv.aumentarVolume();
        System.out.println("Aumentar o volume inicial um uma unidade, para: "+ smartTv.volume);

        smartTv.reduzirVolume();
        smartTv.reduzirVolume();
        System.out.println("Reduzir o volume inicial em uma unidade, para: " + smartTv.volume);

        smartTv.reduzirVolumeExtra();
        System.out.println("Reduzindo mais o volume, para: " + smartTv.volume);

        smartTv.mudarCanal(25);
        System.out.println("Mudando para um canal determinado: "+ smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Procurando um canal acima: "+ smartTv.canal);

        smartTv.reduzirCanal();
        System.out.println("Procurando um canal abaixo do especificado: "+ smartTv.canal);


    }





}
