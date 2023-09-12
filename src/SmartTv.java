public class SmartTv {
    
    
        boolean ligada = false;
        int volume = 21;
        int canal = 3;

        public void ligar(){
            ligada = true;
        };
        public void desligar (){
            ligada = false;
        };
        public void aumentarVolume(){
            ++volume;
        };
        public void reduzirVolume(){
            --volume;
        };
        public void reduzirVolumeExtra(){
            --volume;
            --volume;
            --volume;
        };
        public void mudarCanal (int novoCanal){
            canal = novoCanal;
        };
        public void aumentarCanal (){
            ++canal;
        };
        public void reduzirCanal (){
            --canal;
            --canal;
        }
        
        

}
