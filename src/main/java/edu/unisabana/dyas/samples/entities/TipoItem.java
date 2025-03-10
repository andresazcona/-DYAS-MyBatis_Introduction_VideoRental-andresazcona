package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;

/**
 * Representa un tipo de item en el sistema, como una categoría o clasificación
 * para los items disponibles para renta. La clase implementa la interfaz Serializable
 * para permitir la serialización de objetos `TipoItem` y su almacenamiento o transmisión.
 */
public class TipoItem implements Serializable {

    private int id;  // El campo id debe existir, es el identificador único del tipo de item
    private String descripcion;  // Descripción del tipo de item (ej. "Electrónico", "Mueble")

    /**
     * Obtiene el identificador único del tipo de item.
     *
     * @return El ID del tipo de item.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del tipo de item.
     *
     * @param id El ID del tipo de item.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la descripción del tipo de item.
     *
     * @return La descripción del tipo de item.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del tipo de item.
     *
     * @param descripcion La descripción del tipo de item.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve una representación en cadena del objeto `TipoItem`, mostrando su ID y descripción.
     *
     * @return Una cadena representando el objeto `TipoItem`.
     */
    @Override
    public String toString() {
        return "TipoItem{" + "id=" + id + ", descripcion='" + descripcion + '\'' + '}';
    }
}
