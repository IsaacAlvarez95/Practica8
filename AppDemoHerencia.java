import java.util.ArrayList;

public class AppDemoHerencia {
    
    public static void main(String[] args) {
        Microprocesador cpu = new Microprocesador(8, (long) 3.3, 
                                        "Qualcomm", "Ai9", 
                                        "Qualcomm", "SnapDragon", 1000);
        Sensor sensorHuella = new Sensor("Sensor de huella", "Centigrados", 36, 
                                        "Samsung", "AUY8778", "Samsung", "Sensor", 200);
        Pantalla pantalla = new Pantalla(1600, 900, 256, (long)3.4, "Xiaomi", "AAA873", 
                                        "Samsung", "Pantalla Led", 1600);
        Smartphone smartphone1 = new Smartphone("Samsung", "78A", "Samsung", 
                            "Samsung Galaxy A", 8000, cpu , 16000, sensorHuella, pantalla);
        Smartphone smartphone2 = new Smartphone("Apple", "16G", "Iphone", 
                            "Iphone 16", 8000, cpu , 16000, sensorHuella, pantalla);
        Television television1 = new Television("Sanyo", "895-56985", "Sanyo", "Pantalla Led",
                                7500, pantalla);
        Television television2 = new Television("Sony", "798-56985", "Sony", "Pantalla Led",
                            8500, pantalla);
        
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);
        listaDeTVs.add(television1);
        listaDeTVs.add(television2);

        for(Smartphone smartphone: listaDeSmartphones){
            System.out.println(smartphone + "\n");
        }
        for(Television television: listaDeTVs){
            System.out.println(television + "\n");
        }
    }

}
