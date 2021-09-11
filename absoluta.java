package agencia;
import java.util.ArrayList;
import java.util.List;
public class absoluta extends Promocion {
	
	List<Atraccion> atraccionesContenidas = new ArrayList<Atraccion>();
	private double costo;
	protected boolean atraccionConCupo = true;
	private double tiempo;
	
	public absoluta( TipoDeDescuento tipoDescuento,  tipoDeProducto tipo, 
			tipoDeAtraccion tipoAtraccion,String nombre,double costo, List<Atraccion> lista) {
		super(tipo, tipoAtraccion,nombre);
		this.costo = costo;
		atraccionesContenidas.addAll( lista);
	}
	
public void setTiempo() {
		
		for (int i = 0; i < atraccionesContenidas.size(); i++) {
			this.tiempo += atraccionesContenidas.get(i).getTiempo();
		}
		
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public double calcularCosto() {
		return costo;
	}
	
	public void agregarAtracciones(List<Atraccion> lista) {
		this.atraccionesContenidas.addAll(lista);
	}
	
	@Override
	public String toString() {
		String retorno = this.getNombre() + " " + this.costo;
		return retorno;
	}
	
	

	public void reducirCupoPromocion(agencia a1) {
		//lista de atracciones -- itere si es equals del nombre es el mismo:
				// agarra atracccion de la lista -- DISMINUIR CUPO
				// AGARRA ATRACCION DENTRO DE LAS PROMOS --DISMINUIR CUPO
				// agarra la atraccion de la lista -- Chequea atraccion con cupo -- si cupo == 0 cabiar a falso
				// agarra la atraccion en las promos -- 



				for (int i = 0; i < atraccionesContenidas.size(); i++) {
					int posicionDeLaAtraccion = a1.listaDeAtracciones.indexOf(atraccionesContenidas.get(i));
					a1.listaDeAtracciones.get(posicionDeLaAtraccion).reducirCupo();
					if(a1.listaDeAtracciones.get(posicionDeLaAtraccion).getAtraccionConCupo()!=true) this.atraccionConCupo = false;
				}
			}
			
		
	}
