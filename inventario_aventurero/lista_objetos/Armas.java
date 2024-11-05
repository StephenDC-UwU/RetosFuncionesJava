package lista_objetos;

import java.util.Objects;

public class Armas {
    private static int contadorArmas = 0;
    private int idArmas;
    private int damage;
    private String element;

    public enum TipoArma{
        ESPADA,
        MAZOS,
        ARCOS
    }


    public Armas(String nombre, TipoArma tipo, String rareza, int damage, String element) {
        super();
        this.idArmas = ++contadorArmas;
        this.damage = damage;
        this.element = element;
    }

    public int getIdArmas() {
        return idArmas;
    }

    public void setIdArmas(int idArmas) {
        this.idArmas = idArmas;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Armas{" +
                "idArmas=" + idArmas +
                ", damage=" + damage +
                ", element='" + element + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Armas armas = (Armas) o;
        return idArmas == armas.idArmas && damage == armas.damage && Objects.equals(element, armas.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArmas, damage, element);
    }
}
