package generacidad2;

class Caja<T> {
    private String color;
    private T objeto;

    public Caja(String color, T obj) {
        this.color = color;
        this.objeto = obj;
    }

    public String getColor() {
        return color;
    }

    public T getObjeto() {
        return objeto;
    }

    @Override
    public String toString() {
        return "Caja [color=" + color + ", objeto=" + objeto + "]";
    }
}
