package generacidad2;

public class Principal {
    public static void main(String[] args) {

        Chocolate c = new Chocolate("milka");
        Chocolate c1 = new Chocolate("milka");
        Chocolate c2 = new Chocolate("ferrero");
        Caramelo g = new Caramelo("toffee", 4.8);
        Caramelo g1 = new Caramelo("caramelo", 4.7);
        Caramelo g2 = new Caramelo("chicle", 5.3);

        Caja<Chocolate> cajcho1 = new Caja<>("rojo", c);
        Caja<Chocolate> cajCho2 = new Caja<>("verde", c1);
        Caja<Caramelo> cajCar1 = new Caja<>("azul", g);
        Caja<Caramelo> cajCar2 = new Caja<>("rojo", g1);

        Cajoneria<Caja<?>> cajonero = new Cajoneria<>();
        cajonero.addCaja(cajcho1);
        cajonero.addCaja(cajCho2);
        cajonero.addCaja(cajCar1);
        cajonero.addCaja(cajCar2);

        System.out.println(cajonero.search(c1));
        System.out.println(cajonero.delete(g1));
        System.out.println(cajonero.search(g1));

        System.out.println(cajonero.toString());
    }
}