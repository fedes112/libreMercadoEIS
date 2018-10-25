package backend.impl;

import backend.PublicacionDAO;
import modelo.Publicacion;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import service.runner.Runner;

public class HibernatePublicacionDAO implements PublicacionDAO {

    @Override
    public void guardar(Publicacion publicacion) {

        Session session = Runner.getCurrentSession();
        session.save(publicacion);
    }

    @Override
    public Publicacion recuperar(Serializable id) {
        Session session = Runner.getCurrentSession();
        return  session.get(Publicacion.class, id);

    }

    @Override
    public List<Publicacion> recuperarTodas() {
        Session session = Runner.getCurrentSession();

        String hql = "from Publicacion p ";

        Query<Publicacion> query = session.createQuery(hql,  Publicacion.class);
        return query.getResultList();
    }
}
