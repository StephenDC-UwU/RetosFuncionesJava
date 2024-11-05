package inventario;

import lista_objetos.Armas;
import lista_objetos.Tesoros;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static final List<Armas> armas;
    private static final List<Tesoros> tesoros;

    static{
        armas = new ArrayList<>();
        armas.add(new Armas("Espada del Huracan", Armas.TipoArma.ESPADA,"Epico",10, "Viento"));
        armas.add(new Armas("Espada del Fenix",Armas.TipoArma.ESPADA,"Legendaria",25, "Fuego"));
        armas.add(new Armas("Mazo del Vacio",Armas.TipoArma.MAZOS,"Epico",40, "Oscuridad"));
        tesoros = new ArrayList<>();

    }

    public static void agregarArmas(Armas arma) {
        armas.add(arma);
    }

    public static void mostrarArmas() {
        var inventarioArmas = "";
        for (var arma : armas) {
            inventarioArmas += arma.toString() + "\n";
        }
        System.out.println("--Mostrando Las Armas--");
        System.out.println(inventarioArmas);
    }

    public static void editarArmas(int idArma, Armas arma) {
        try {
            armas.get(idArma);
        } catch (Exception e) {
            System.out.println("El id indicado no existe");
            System.out.println(e);
            return;
        }
        armas.set(idArma,arma);
        System.out.println("Mostrando el arma modificada");
        System.out.println(armas.get(idArma));


    }







    public static List<Armas> getArmas(){
        return armas;
    }
}
