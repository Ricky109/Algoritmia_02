package generacidad2;

import java.util.ArrayList;
import java.util.Iterator;

class Cajoneria<T> implements Iterable<T> {
    private ArrayList<Caja<T>> cajones;

    public Cajoneria() {
        this.cajones = new ArrayList<>();
    }

    public void addCaja(Caja caja) {
        cajones.add(caja);
    }

    public <T> String search(T obj) {
		for(int i=0; i<cajones.size(); i++) {
			if(cajones.get(i).getObjeto().equals(obj)) {
				return i+"	"+cajones.get(i).getColor();
			}
		}
		return "no existe el elemento";
	}
	
	public <T> String delete(T obj) {
		for(int i=0; i<cajones.size(); i++) {
			if(cajones.get(i).getObjeto().equals(obj)) {
				cajones.remove(i).getObjeto();
				return "elemento eliminado";
			}
		}
		return "no existe el elemento";
	}

    @Override
    public Iterator<T> iterator() {
        ArrayList<T> contenidoTotal = new ArrayList<>();
        for (Caja<T> caja : cajones) {
            contenidoTotal.add(caja.getObjeto());
        }
        return contenidoTotal.iterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cajones.size(); i++) {
            Caja<T> caja = cajones.get(i);
            builder.append(i + 1).append(" ").append(caja.getColor()).append(" ").append(caja.getObjeto()).append("\n");
        }
        return builder.toString();
    }
}