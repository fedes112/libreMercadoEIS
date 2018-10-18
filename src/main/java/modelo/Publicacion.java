package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publicacion {

    @Id
    @GeneratedValue
    private int id;

    private String nombreDeLaPublicacion;
    private Double precioProducto;
    private Double stock;

    public Publicacion(String nombreDeLaPublicacion, double precioProducto , double stock) {
        this.nombreDeLaPublicacion = nombreDeLaPublicacion;
        this.precioProducto = precioProducto;
        this.stock = stock;

    }

    public Double getPrecio() {
        return this.precioProducto;
    }

    public void comprar() {
        this.stock --;
    }

    public double getStock() {
        return this.stock;
    }
}
