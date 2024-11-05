package objeto;

public class Armas extends Tipo {
    private static int contadorArmas = 0;
    protected int idArma;
    protected int damage;
    public enum Elemento {
        FUEGO,VIENTO,TIERRA,AGUA
    }

    public Armas(String nombre, int damage,Elemento elemento) {
        super(nombre);
        this.idArma = contadorArmas++;
        this.damage = damage;

    }

    @Override
    public String toString() {
        return "Armas{" +
                "idArma=" + idArma +
                ", damage=" + damage +
                "} " + super.toString();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Aparece un Arma");

    }
}
