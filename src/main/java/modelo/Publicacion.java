package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publicacion {


   /* @GeneratedValue
    private int id;*/
   @Id
    private String nombreDeLaPublicacion;
    private Double precioProducto;
    private Double stock;

    public Publicacion(String nombreDeLaPublicacion, double precioProducto , double stock) {
        this.nombreDeLaPublicacion = nombreDeLaPublicacion;
        this.precioProducto = precioProducto;
        this.stock = stock;

    }

    public Publicacion(){

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

    public String getNombre() {
        return this.nombreDeLaPublicacion;
    }
}
