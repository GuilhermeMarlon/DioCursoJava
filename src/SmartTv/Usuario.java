package SmartTv;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();
        
        System.out.println("TV ligada ?"+SmartTv.ligada);
        System.out.println("Canal atual: "+SmartTv.canal);
        System.out.println("Volume Atual : "+SmartTv.volume);

        SmartTv.ligar();
        System.out.println("TV ligada ?"+SmartTv.ligada);
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual : "+SmartTv.volume);
        SmartTv.diminuirVolume();
        System.out.println("Volume Atual : "+SmartTv.volume);
        SmartTv.trocarCanal(5); 
        System.out.println("Canal atual: "+SmartTv.canal);

    }   
}
