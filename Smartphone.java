public class Smartphone extends Computadora {
    
    private Sensor sensorDeHuella;
    private Pantalla pantalla;

    public Smartphone(String fabricante , String numeroSerie ,
                String marca , String nombre ,
                float costo, Microprocesador cpu, long ramMb , 
                Sensor sensorDeHuella , Pantalla pantalla){
        super(fabricante,numeroSerie,marca,nombre,costo,cpu,ramMb);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }
    @Override
    public String toString(){
        return super.toString() + " " +
                "-> Sensor de Huella - " + sensorDeHuella + " " +
                "-> Pantalla - " + pantalla + "\n";
    }

}
