package objeto;

public class Pociones extends Tipo {
    private static int contadorPociones = 0;
    protected int idPociones;
    protected int curacion;

    public Pociones(String nombre, int curacion) {
        super(nombre);
        this.idPociones = contadorPociones++;
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return "Pociones{" +
                "idPociones=" + idPociones +
                ", curacion=" + curacion +
                "} " + super.toString();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Aparece una Pocion");
    }
}
