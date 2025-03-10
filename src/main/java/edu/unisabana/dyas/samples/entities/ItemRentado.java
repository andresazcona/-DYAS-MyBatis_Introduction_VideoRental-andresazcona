package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;
import java.sql.Date;

/**
 * Representa un item rentado por un cliente en el sistema.
 * La clase implementa la interfaz Serializable para permitir la serialización
 * de objetos `ItemRentado` y su almacenamiento o transmisión.
 *
 * Un `ItemRentado` contiene un item específico que ha sido alquilado, junto con
 * las fechas de inicio y fin del alquiler.
 *
 * @author cesarvefe & andresazcona
 */
public class ItemRentado implements Serializable {

    private int id;  // Identificador único del item rentado

    private Item item;  // El item que ha sido rentado
    private Date fechainiciorenta;  // Fecha de inicio de la renta
    private Date fechafinrenta;  // Fecha de finalización de la renta

    /**
     * Constructor que inicializa todos los atributos del objeto `ItemRentado`.
     *
     * @param id El ID único del item rentado.
     * @param item El item que ha sido rentado.
     * @param fechainiciorenta La fecha de inicio del alquiler.
     * @param fechafinrenta La fecha de finalización del alquiler.
     */
    public ItemRentado(int id, Item item, Date fechainiciorenta, Date fechafinrenta) {
        this.id = id;
        this.item = item;
        this.fechainiciorenta = fechainiciorenta;
        this.fechafinrenta = fechafinrenta;
    }

    /**
     * Constructor por defecto.
     */
    public ItemRentado() {
    }

    /**
     * Obtiene el identificador único del item rentado.
     *
     * @return El ID del item rentado.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del item rentado.
     *
     * @param id El ID del item rentado.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el item que ha sido rentado.
     *
     * @return El objeto `Item` que ha sido rentado.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Establece el item que ha sido rentado.
     *
     * @param item El objeto `Item` que será rentado.
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Obtiene la fecha de inicio del alquiler del item.
     *
     * @return La fecha de inicio de la renta.
     */
    public Date getFechainiciorenta() {
        return fechainiciorenta;
    }

    /**
     * Establece la fecha de inicio del alquiler del item.
     *
     * @param fechainiciorenta La fecha de inicio del alquiler.
     */
    public void setFechainiciorenta(Date fechainiciorenta) {
        this.fechainiciorenta = fechainiciorenta;
    }

    /**
     * Obtiene la fecha de finalización del alquiler del item.
     *
     * @return La fecha de finalización de la renta.
     */
    public Date getFechafinrenta() {
        return fechafinrenta;
    }

    /**
     * Establece la fecha de finalización del alquiler del item.
     *
     * @param fechafinrenta La fecha de finalización del alquiler.
     */
    public void setFechafinrenta(Date fechafinrenta) {
        this.fechafinrenta = fechafinrenta;
    }

    /**
     * Devuelve una representación en cadena del objeto `ItemRentado`,
     * mostrando los atributos principales como el id, el item rentado
     * y las fechas de inicio y fin de la renta.
     *
     * @return Una cadena representando al objeto `ItemRentado`.
     */
    @Override
    public String toString() {
        return "ItemRentado{" + "id=" + id + ", item=" + item + ", fechainiciorenta=" + fechainiciorenta + ", fechafinrenta=" + fechafinrenta + '}';
    }
}
