package generacidad2;

class Caramelo {
    private String nombre;
    private double peso;

    public Caramelo(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Caramelo [nombre=" + nombre + ", peso=" + peso + "]";
    }
}
