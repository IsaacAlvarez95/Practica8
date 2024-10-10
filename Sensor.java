public class Sensor extends ComponenteElectronico{
    private String tipo;
    private String unidadDeMedida;
    private int valor;

    public Sensor(String tipo, String unidadDeMedida, int valor,
            String fabricante , String numeroSerie ,
            String marca , String nombre ,
            float costo){
        super(fabricante,numeroSerie,marca,nombre,costo);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }
    @Override
    public String toString(){
        return super.toString() + " " +
                "-> Tipo : " + tipo + " " +
                "-> Unidad de medida : " + unidadDeMedida + " " +
                "-> Valor : " + valor + "\n";
    }

}
