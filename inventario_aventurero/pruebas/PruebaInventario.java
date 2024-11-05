package pruebas;

import inventario.Inventario;
import lista_objetos.Armas;

import java.util.Scanner;

public class PruebaInventario {

    public static void main(String[] args) {
        System.out.println("El inventario del Guerrero");
        System.out.println("""
                Que deseas hacer:
                1. Agregar un Arma
                2. Editar un Arma
                2. Mostrar todos los Objetos
                3. Mostrar solo Armas, pociones o Tesoros
                4. Salir
                """);

        Scanner input = new Scanner(System.in);
        var inputNumber = input.nextInt();
        input.nextLine();



        while (inputNumber!= 4){

            if (inputNumber==1) {
                System.out.println("Agregando un Arma...");
                agregarArma(input);
            } else if (inputNumber==2) {
                System.out.println("Editando un Arma");
                editarArma(input);
            }

            System.out.println("El inventario del Guerrero");
            System.out.println("""
                Que deseas hacer:
                1. Agregar un Arma
                2. Editar un Arma
                2. Mostrar todos los Objetos
                3. Mostrar solo Armas, pociones o Tesoros
                4. Salir
                """);
            inputNumber = input.nextInt();
            input.nextLine();
        }
    }

    private static void agregarArma(Scanner input) {
        System.out.println("Nombre del Arma: ");
        var nombre = input.nextLine();

        System.out.println("Tipo de Arma (ESPADA, HACHA, ARCO): ");
        var tipoInput = input.nextLine().toUpperCase(); // Convertir a mayúsculas para la comparación
        Armas.TipoArma tipo;
        try {
            tipo = Armas.TipoArma.valueOf(tipoInput); // Convertir a TipoArma
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de arma no válido. Usa solo ESPADA, HACHA o ARCO.");
            return; // Salir si el tipo no es válido
        }

        System.out.println("Rareza del arma: ");
        var rareza = input.nextLine();
        System.out.println("Elemento que fue construido el arma: ");
        var element = input.nextLine();
        System.out.println("Daño del arma: ");
        var damage = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        // Crear un objeto de Armas con el tipo enum
        Inventario.agregarArmas(new Armas(nombre, tipo, rareza, damage, element));
        System.out.println("Se ha agregado tu arma correctamente");

        Inventario.mostrarArmas();
    }


    private static void editarArma(Scanner input) {
        System.out.println("Cual arma quieres editar? (Id:)");
        var idArma = input.nextInt();
        input.nextLine();
        System.out.println("Nombre del Arma: ");
        var nombre = input.nextLine();

        System.out.println("Tipo de Arma (ESPADA, HACHA, ARCO): ");
        var tipoInput = input.nextLine().toUpperCase(); // Convertir a mayúsculas para la comparación
        Armas.TipoArma tipo;
        try {
            tipo = Armas.TipoArma.valueOf(tipoInput); // Convertir a TipoArma
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de arma no válido. Usa solo ESPADA, HACHA o ARCO.");
            return; // Salir si el tipo no es válido
        }

        System.out.println("Rareza del arma: ");
        var rareza = input.nextLine();
        System.out.println("Elemento que fue construido el arma: ");
        var element = input.nextLine();
        System.out.println("Daño del arma: ");
        var damage = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        Inventario.editarArmas(idArma,new Armas(nombre,tipo,rareza,damage,element));
        System.out.println("Se ha agregado correctamente");

        Inventario.mostrarArmas();

    }


}
