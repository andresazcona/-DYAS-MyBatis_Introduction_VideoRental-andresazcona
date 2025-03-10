package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Representa un item en el sistema de alquiler, como un producto o servicio disponible para renta.
 * La clase implementa la interfaz Serializable para permitir la serialización de objetos Item.
 */
public class Item implements Serializable {

    private int id;  // El campo id será auto-generado por SQLite
    private String nombre;  // Nombre del item
    private String descripcion;  // Descripción del item
    private Date fechaLanzamiento;  // Fecha de lanzamiento del item
    private long tarifaxDia;  // Tarifa de renta por día
    private String formatoRenta;  // Formato en el que se puede rentar el item (ej. "Diario", "Semanal")
    private String genero;  // Género o categoría del item (ej. "Acción", "Comedia")
    private TipoItem tipo;  // Relación con TipoItem, que representa el tipo o categoría del item

    /**
     * Obtiene el identificador único del item.
     *
     * @return El id del item.
     */
    public int getId() {
        return id;  // El id no debe ser asignado manualmente, SQLite lo maneja automáticamente
    }

    /**
     * Establece el identificador único del item.
     * Este método no debería ser utilizado directamente, ya que el id se genera automáticamente por SQLite.
     *
     * @param id El id del item.
     */
    public void setId(int id) {
        this.id = id;  // No deberías asignar manualmente el id, SQLite lo hace automáticamente
    }

    /**
     * Obtiene el nombre del item.
     *
     * @return El nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del item.
     *
     * @param nombre El nombre del item.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del item.
     *
     * @return La descripción del item.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del item.
     *
     * @param descripcion La descripción del item.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha de lanzamiento del item.
     *
     * @return La fecha de lanzamiento del item.
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Establece la fecha de lanzamiento del item.
     *
     * @param fechaLanzamiento La fecha de lanzamiento del item.
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Obtiene la tarifa diaria del item.
     *
     * @return La tarifa diaria del item.
     */
    public long getTarifaxDia() {
        return tarifaxDia;
    }

    /**
     * Establece la tarifa diaria del item.
     *
     * @param tarifaxDia La tarifa diaria del item.
     */
    public void setTarifaxDia(long tarifaxDia) {
        this.tarifaxDia = tarifaxDia;
    }

    /**
     * Obtiene el formato de renta del item.
     *
     * @return El formato de renta del item.
     */
    public String getFormatoRenta() {
        return formatoRenta;
    }

    /**
     * Establece el formato de renta del item.
     *
     * @param formatoRenta El formato de renta del item.
     */
    public void setFormatoRenta(String formatoRenta) {
        this.formatoRenta = formatoRenta;
    }

    /**
     * Obtiene el género o categoría del item.
     *
     * @return El género o categoría del item.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género o categoría del item.
     *
     * @param genero El género o categoría del item.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el tipo de item, que es una relación con la clase TipoItem.
     *
     * @return El objeto `TipoItem` que representa el tipo del item.
     */
    public TipoItem getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de item, que es una relación con la clase TipoItem.
     *
     * @param tipo El objeto `TipoItem` que representa el tipo del item.
     */
    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en cadena del item, con su id, nombre, descripción,
     * fecha de lanzamiento, tarifa, formato de renta, género y tipo.
     *
     * @return Una cadena que representa al item.
     */
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", tarifaxDia=" + tarifaxDia +
                ", formatoRenta='" + formatoRenta + '\'' +
                ", genero='" + genero + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
