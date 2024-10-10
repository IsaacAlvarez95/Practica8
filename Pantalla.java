public class Pantalla extends ComponenteElectronico {
    private int resolucionX;
    private int resolucionY;

    public Pantalla(int resolucionX, int resolucionY,
                            int cacheRam, long velocidadHz,
                            String fabricante , String numeroSerie ,
                            String marca , String nombre ,
                            float costo){
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }
    @Override
    public String toString(){
        return super.toString() + " " +
                "-> Resolucion : " + resolucionX + " x " + resolucionY + "\n";
    }
}

