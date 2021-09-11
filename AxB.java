package agencia;
import java.util.*;



public class AxB extends Promocion {

	List<Producto> atraccionesContenidas = new ArrayList<Producto>();
	
	protected boolean atraccionConCupo = true;
	private double costo;
	private double tiempo;
	private double descuento = 0;
	
	public AxB(TipoDeDescuento tipoDescuento,  tipoDeProducto tipo, 
			tipoDeAtraccion tipoAtraccion,String nombre,double costo, List<Atraccion> lista) {
		super(tipo, tipoAtraccion,nombre);
		atraccionesContenidas.addAll(lista);
		
	}
	
	
	@Override
	public double calcularCosto() {
		double costo = 0;
		for (int i = 0; i < atraccionesContenidas.size()-1; i++) {
			costo += atraccionesContenidas.get(i).getPrecio();
		}
		return costo;
	}
	
	public void setTiempo() {
		
		for (int i = 0; i < atraccionesContenidas.size(); i++) {
			this.tiempo += atraccionesContenidas.get(i).getTiempo();
		}
		
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	public void agregarAtraccionesContenidas(List<Atraccion> lista) {
		atraccionesContenidas.addAll(lista);
	}
	
	public void reducirCupoPromocion(agencia a1) {
		for (int i = 0; i < atraccionesContenidas.size(); i++) {
			int posicionDeLaAtraccion = a1.listaDeAtracciones.indexOf(atraccionesContenidas.get(i));
			a1.listaDeAtracciones.get(posicionDeLaAtraccion).reducirCupo();
			if(a1.listaDeAtracciones.get(posicionDeLaAtraccion).getAtraccionConCupo()!=true) this.atraccionConCupo = false;
		}
	}
	
	@Override
	public String toString() {
		String retorno = this.getNombre() + " " + this.costo;
		return retorno;
	}

}