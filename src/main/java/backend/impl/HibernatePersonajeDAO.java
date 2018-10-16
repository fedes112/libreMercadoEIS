package backend.impl;

import backend.PersonajeDAO;
import modelo.Personaje;
import org.hibernate.Session;
import service.runner.Runner;

public class HibernatePersonajeDAO implements PersonajeDAO {

    @Override
    public void guardar(Personaje personaje) {
        Session session = Runner.getCurrentSession();
        session.save(personaje);
    }

    @Override
    public Personaje recuperar(String nombre) {
        Session session = Runner.getCurrentSession();
        return session.get(Personaje.class, nombre);
    }
}
