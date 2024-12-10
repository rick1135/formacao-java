public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void avancarCanal(){
        canal++;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void retrocederCanal(){
        canal--;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int canal){
        this.canal = canal;
    }
}
