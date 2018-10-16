package backend;

import modelo.Item;

import java.util.Collection;

public interface ItemDAO {
    void guardar(Item personaje);

    Item recuperar(String nombre);

    Collection<Item> getAll();

    Collection<Item> getMasPesados(int peso);

    Collection<Item> getItemsDePersonajesDebiles(int unaVida);

    Item getHeaviestItem();

}
