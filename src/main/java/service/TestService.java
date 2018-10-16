package service;

import org.hibernate.Session;
import service.runner.Runner;

import java.io.Serializable;

public class TestService {

    public void crearEntidad(Object object) {
        Runner.runInSession(() -> {
            Session session = Runner.getCurrentSession();
            session.save(object);
            return null;
        });
    }

    public <T> T recuperarEntidad(Class<T> tipo, Serializable key) {
        return Runner.runInSession(() -> {
            Session session = Runner.getCurrentSession();
            T valor = session.get(tipo, key);
            return valor;
        });
    }

}
