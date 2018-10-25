package service;

import backend.PublicacionDAO;
import modelo.Publicacion;
import service.runner.Runner;

import java.util.List;


public class ServicePublicacion {

    private PublicacionDAO publicacionDAO;

    public ServicePublicacion(PublicacionDAO publicacionDAO) {
        this.publicacionDAO = publicacionDAO;
    }


    public void guardarPublicacion(Publicacion publicacion) {
        Runner.runInSession(() -> {
            this.publicacionDAO.guardar(publicacion);
            return null;
        });
    }

    public Publicacion recuperarPublicacion(String nombrePublicacion) {
       return  Runner.runInSession(() -> {
            Publicacion publicacion = this.publicacionDAO.recuperar(nombrePublicacion);
            return publicacion;
        });
    }

    public List<Publicacion> recuperarTodasLasPublicaciones() {
        return Runner.runInSession(() -> {
             List<Publicacion> publicaciones = this.publicacionDAO.recuperarTodas();
             return publicaciones;
        });
    }


}
