package ingreso.com.guido.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue
	private int id;
	
	private String nombreProducto;
	private float precioProducto;
	private int cantidad;
	private float precioPorCantidad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public float getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public float getPrecioPorCantidad() {
		return precioPorCantidad;
	}
	public void setPrecioPorCantidad(float precioPorCantidad) {
		this.precioPorCantidad = precioPorCantidad;
	}
		
	public void precioPorCantidad(){
		float precioFinal = (this.precioProducto * this.cantidad);
		
		this.precioPorCantidad = precioFinal;
	}
	
	
	
}
