package backendTest;

import backend.PublicacionDAO;
import backend.impl.HibernatePublicacionDAO;
import modelo.Publicacion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.ServicePublicacion;
import service.runner.SessionFactoryProvider;

import java.util.Collection;

public class PublicacionServiceTest {
    private ServicePublicacion service;
    private Publicacion publicacion;

    @Before
    public void prepare() {
        PublicacionDAO publicacionDAO = new HibernatePublicacionDAO();

        this.publicacion = new Publicacion("Papafritas",100,20);
        this.service = new ServicePublicacion(publicacionDAO);

    }

    @After
    public void cleanup() {
        //Destroy cierra la session factory y fuerza a que, la proxima vez, una nueva tenga
        //que ser creada.
        //
        //Al tener hibernate configurado con esto <property name="hibernate.hbm2ddl.auto">create-drop</property>
        //al crearse una nueva session factory todo el schema será destruido y creado desde cero.
        SessionFactoryProvider.destroy();
    }


    @Test
    public void test_GuardarPublicacion() {
        this.service.guardarPublicacion(this.publicacion);
        Publicacion publicacionARecuperar = this.service.recuperarPublicacion("Papafritas");

        Assert.assertEquals(publicacionARecuperar.getNombre(), this.publicacion.getNombre());
    }


}
