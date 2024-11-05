package objeto;

public abstract class Tipo {
    private static int contadorTipo = 0;
    protected int idTipo;
    protected String nombre;

    public Tipo(String nombre) {
        this.idTipo = contadorTipo++;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "idTipo=" + idTipo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public abstract void mostrarDetalles();

}

