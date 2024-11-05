package objeto;

public class Objeto {
    private static int contadorObjetos = 0;
    private int idObjeto;
    private String nombre;
    private String descripcion;
    protected Tipo tipo;
    protected Rareza rareza;

    public enum Rareza{
        NORMAL,EPICO,RARO,LEGENDARIO
    }

    public Objeto(String nombre, String descripcion, Tipo tipo, Rareza rareza) {
        this.idObjeto = contadorObjetos++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.rareza = rareza;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Rareza getRareza() {
        return rareza;
    }

    public void setRareza(Rareza rareza) {
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "idObjeto=" + idObjeto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", rareza=" + rareza +
                '}';
    }
}

