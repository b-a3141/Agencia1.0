package agencia;

import java.util.*;


public abstract class Promocion extends Producto {
	
	List<Atraccion> atraccionesContenidas = new ArrayList<Atraccion>();
	public boolean atraccionConCupo = true;
	String nombre;
	
	public Promocion(tipoDeProducto tipo, tipoDeAtraccion tipoAtraccion,String nombre) {
		super(tipo, tipoAtraccion);
		this.nombre = nombre;
	}

	public List<Atraccion> getAtraccionesContenidas() {
		return atraccionesContenidas;
	}
	
	public List<Atraccion> setAtraccionesContenidas(Atraccion a) {
		this.atraccionesContenidas.add(a);
		return  this.atraccionesContenidas;
	}
	

	public boolean isAtraccionConCupo() {
		return atraccionConCupo;
	}

	public void setAtraccionConCupo(boolean atraccionConCupo) {
		this.atraccionConCupo = atraccionConCupo;
	}
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		String datos = "";
		for (int i = 0; i < atraccionesContenidas.size(); i++) {
			datos += atraccionesContenidas.get(i).getNombre() + " ";
		}
		
		return datos;
	}
	
		
	@Override
	public double getPrecio() {
	
		return 0;
	}
	
	
	
	
}
