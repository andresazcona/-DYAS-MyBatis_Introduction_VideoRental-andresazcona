package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.unisabana.dyas.samples.entities.TipoItem;

/**
 * Interfaz que define los métodos de acceso a los datos relacionados con los tipos de items
 * en la base de datos. Utiliza MyBatis para mapear las operaciones SQL a objetos Java.
 *
 * @author cesarvefe & andresazcona
 */
public interface TipoItemMapper {

    /**
     * Consulta todos los tipos de items registrados en la base de datos.
     *
     * Este método ejecuta una consulta SQL para recuperar todos los tipos de items.
     * Devuelve una lista de objetos `TipoItem` que representan cada tipo de item registrado.
     *
     * @return Una lista de objetos `TipoItem` representando todos los tipos de items en la base de datos.
     */
    public List<TipoItem> getTiposItems();

    /**
     * Consulta un tipo de item específico por su identificador único (ID).
     *
     * Este método ejecuta una consulta SQL para recuperar los datos de un tipo de item
     * basado en su ID. La consulta busca un tipo de item con el ID proporcionado en la base de datos.
     *
     * @param id El ID del tipo de item que se desea consultar.
     * @return Un objeto `TipoItem` con los datos del tipo de item encontrado o `null` si no se encuentra.
     */
    public TipoItem getTipoItem(int id);

    /**
     * Inserta un nuevo tipo de item en la base de datos.
     *
     * Este método ejecuta una inserción SQL para agregar un nuevo tipo de item a la base de datos.
     * Recibe una cadena de texto (`String`) que contiene la descripción del tipo de item a insertar.
     *
     * @param des La descripción del nuevo tipo de item que se desea agregar.
     */
    public void addTipoItem(String des);
}
