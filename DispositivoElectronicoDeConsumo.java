public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{

    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante , String numeroSerie ,
                                    String marca , String nombre ,
                                    float costo){
        super(fabricante,numeroSerie,marca,nombre,costo);
        encendido = false;
    }

    public void encender(){
        encendido = true;
    }

    public void apagar(){
        encendido = false;
    }

    public boolean isEncendido(){
        return encendido;
    }

    @Override
    public String toString(){
        return super.toString() + " " +
                "-> Encendido: " + isEncendido() + "\n";
    }
}