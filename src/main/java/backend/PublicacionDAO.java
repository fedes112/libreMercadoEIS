package backend;

import modelo.Publicacion;

import java.io.Serializable;
import java.util.List;

public interface PublicacionDAO {

    void guardar(Publicacion publicacion);

    Publicacion recuperar(Serializable idPublicacion);

     List<Publicacion> recuperarTodas();

}
