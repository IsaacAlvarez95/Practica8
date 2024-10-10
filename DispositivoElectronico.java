import java.util.*;

public abstract class DispositivoElectronico{

    //Inmutable
    private String fabricante;
    private String numeroSerie;
    private String marca;
    private String nombre;

    //mutable
    float costo;
    ArrayList<ComponenteElectronico> componentes;
    
    public DispositivoElectronico(String fabricante , String numeroSerie ,
                                  String marca , String nombre ,
                                  float costo){
        componentes = new ArrayList<>();
    
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;

        this.costo = costo;
    }

    public void agregarComponente(ComponenteElectronico componenteElectronico){
        componentes.add(componenteElectronico);
    }

    public void quitarComponente(int index){
        componentes.remove(index);
    }

    @Override
    public String toString(){
        return "-> Fabricante : " + fabricante + " " +
                "-> No de Serie : " + numeroSerie + " " + 
                "-> Marca : " + marca + " " + 
                "-> Nombre : " + nombre + " "+
                "-> Costo : " + costo + "\n" + componentes;
    }
}