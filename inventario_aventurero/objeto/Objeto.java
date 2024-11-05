package objeto;

public class Objeto {
    private static int contadorObjetos = 0;
    private int idObjeto;
    private String nombre;
    private String tipo;
    private String rareza;

    public Objeto() {
        this.idObjeto = ++Objeto.contadorObjetos;
    }

    public Objeto(String nombre, String tipo, String rareza) {
        this();
        this.nombre = nombre;
        this.tipo = tipo;
        this.rareza = rareza;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "idObjeto=" + idObjeto +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", rareza='" + rareza + '\'' +
                '}';
    }
}
