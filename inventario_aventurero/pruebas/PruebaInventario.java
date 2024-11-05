package pruebas;


import objeto.*;

import java.util.ArrayList;

public class PruebaInventario {
    public static void main(String[] args) {
        Tipo arma = new Armas("Espada",50, Armas.Elemento.AGUA);
        Tipo arma2 = new Armas("Arco",50, Armas.Elemento.FUEGO);
        Tipo pocion = new Pociones("Pocion de Cura", 20);
        Tipo tesoro = new Tesoros("Corona de Oro", 10);

        arma.mostrarDetalles();
        pocion.mostrarDetalles();
        tesoro.mostrarDetalles();

        Objeto objeto1 = new Objeto("Espada del Ocenao Infinito","Extraida del Oceano Indico", arma, Objeto.Rareza.EPICO);
        Objeto objeto2 = new Objeto("Arco del Guerreo Olvidado","Extraida del Reino de Fuego", arma2, Objeto.Rareza.LEGENDARIO);
        Objeto objeto3 = new Objeto("Bolsa de Oro", "Bolsa de un Viajero",tesoro, Objeto.Rareza.NORMAL);
        Objeto objeto4 = new Objeto("Pocion de Vida","Pocion de Vida del Cura",tesoro, Objeto.Rareza.NORMAL);

        ArrayList<Objeto> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);

        for (Objeto objeto: lista) {
            System.out.println(objeto);
        }




    }


}



