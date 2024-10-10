public class Microprocesador extends ComponenteElectronico{
    private int cacheRam;
    private long velocidadHz;

    public Microprocesador(int cacheRam, long velocidadHz,
                            String fabricante , String numeroSerie ,
                            String marca , String nombre ,
                            float costo){
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.cacheRam = cacheRam;
        this.velocidadHz = velocidadHz;
    }
    @Override
    public String toString(){
        return super.toString() + " " +
                "-> cache Ram : " + cacheRam + " " +
                "-> Velocidad Hz : " + velocidadHz + "\n";
    }
}
