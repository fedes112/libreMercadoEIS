package backend;

import modelo.Personaje;

public interface PersonajeDAO {

    /**
     * Tiene la responsabilidad de guardar y recuperar personajes desde
     * el medio persistente
     */

    void guardar(Personaje personaje);

    Personaje recuperar(String nombre);


}
