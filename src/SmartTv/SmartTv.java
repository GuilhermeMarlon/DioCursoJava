package SmartTv;


public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;



    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume Atual : "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume Atual : "+volume);
    }
    public void trocarCanal(int canal){
        this.canal=canal;
        System.out.println("Canal atual: "+this.canal);
    }
}
