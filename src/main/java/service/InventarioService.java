package service;

import backend.ItemDAO;
import backend.PersonajeDAO;
import modelo.Item;
import modelo.Personaje;
import service.runner.Runner;

import java.util.Collection;

public class InventarioService {

    private PersonajeDAO personajeDAO;
    private ItemDAO itemDAO;

    public InventarioService(PersonajeDAO personajeDAO, ItemDAO itemDAO) {
        this.personajeDAO = personajeDAO;
        this.itemDAO = itemDAO;
    }

    public void recoger(String nombrePersonaje, String nombreItem) {
        Runner.runInSession(() -> {
            Personaje personaje = this.personajeDAO.recuperar(nombrePersonaje);
            Item item = this.itemDAO.recuperar(nombreItem);
            personaje.recoger(item);

            return null;
        });
    }

    public Collection<Item> getAllItems() {
        return Runner.runInSession(() -> {
            return this.itemDAO.getAll();
        });
    }

    public Collection<Item> getMasPesdos(int peso) {
        return Runner.runInSession(() -> {
            return this.itemDAO.getMasPesados(peso);
        });
    }

    public Collection<Item> getItemsPersonajesDebiles(int vida) {
        return Runner.runInSession(() -> {
            return this.itemDAO.getItemsDePersonajesDebiles(vida);
        });
    }

    public Item getHeaviestItem() {
        return Runner.runInSession(() -> {
            return this.itemDAO.getHeaviestItem();
        });
    }
}
