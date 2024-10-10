public abstract class ComponenteElectronico extends DispositivoElectronico{

    public ComponenteElectronico(String fabricante , String numeroSerie ,
                            String marca , String nombre ,
                            float costo){
        super(fabricante,numeroSerie,marca,nombre,costo);
    }

    @Override
    public String toString(){
        return "-> Componente - " + super.toString() + "\n";
    }
}