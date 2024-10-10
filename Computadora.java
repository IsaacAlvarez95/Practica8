public class Computadora extends DispositivoElectronicoDeConsumo {
    
    private Microprocesador cpu;
    private long ramMb;

    public Computadora(String fabricante , String numeroSerie ,
    String marca , String nombre ,
    float costo, Microprocesador cpu, long ramMb){
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.cpu = cpu;
    }
    @Override
    public String toString(){
        return super.toString() + " " +
                "-> Cpu - " + cpu + " "+
                "-> Ram Mb : " + ramMb + "\n";
    }

}
