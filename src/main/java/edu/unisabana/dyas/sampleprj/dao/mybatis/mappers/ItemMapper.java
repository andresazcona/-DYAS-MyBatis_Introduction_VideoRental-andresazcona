package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.unisabana.dyas.samples.entities.Item;

/**
 * Interfaz que define los métodos de acceso a los datos relacionados con los items
 * en la base de datos. Utiliza MyBatis para mapear las operaciones SQL a objetos Java.
 *
 * @author cesarvefe & andresazcona
 */
public interface ItemMapper {

    /**
     * Consulta todos los items registrados en la base de datos.
     *
     * Este método ejecuta una consulta SQL que recupera todos los items de la base de datos.
     * Devuelve una lista de objetos `Item` que representan cada uno de los items registrados.
     *
     * @return Una lista de objetos `Item` representando todos los items en la base de datos.
     */
    public List<Item> consultarItems();

    /**
     * Consulta un item específico por su identificador único (ID).
     *
     * Este método ejecuta una consulta SQL para recuperar los datos de un item
     * basado en su ID. La consulta busca un item con el ID proporcionado en la base de datos.
     *
     * @param id El ID del item que se desea consultar.
     * @return Un objeto `Item` con los datos del item encontrado o `null` si no se encuentra.
     */
    public Item consultarItem(int id);

    /**
     * Inserta un nuevo item en la base de datos.
     *
     * Este método ejecuta una inserción SQL para agregar un nuevo item a la base de datos.
     * Recibe un objeto `Item` con los datos que se desean insertar.
     *
     * @param it El objeto `Item` que contiene la información del nuevo item a insertar.
     */
    public void insertarItem(Item it);
}
