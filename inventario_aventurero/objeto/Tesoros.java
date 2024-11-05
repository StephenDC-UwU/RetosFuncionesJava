package objeto;

public class Tesoros extends Tipo {
    private static int contadorTipo = 0;
    protected int idTesoro;
    protected int costo;

    public Tesoros(String nombre, int costo) {
        super(nombre);
        this.idTesoro= contadorTipo++;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Tesoros{" +
                "idTesoro=" + idTesoro +
                ", costo=" + costo +
                "} " + super.toString();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Aparece un Tesoro");
    }
}
