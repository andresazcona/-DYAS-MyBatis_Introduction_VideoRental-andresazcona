package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Representa a un cliente en el sistema de alquiler. Contiene información personal
 * del cliente y una lista de los items que ha rentado.
 *
 * La clase implementa la interfaz Serializable, lo que permite que los objetos de tipo Cliente
 * puedan ser serializados para ser almacenados o transmitidos a través de la red.
 */
public class Cliente implements Serializable {

    private String nombre;  // Nombre del cliente
    private long documento;  // Documento de identificación del cliente
    private String telefono;  // Teléfono de contacto del cliente
    private String direccion;  // Dirección del cliente
    private String email;  // Correo electrónico del cliente
    private boolean vetado;  // Indica si el cliente está vetado
    private ArrayList<ItemRentado> rentados;  // Lista de items rentados por el cliente

    /**
     * Constructor por defecto para crear un cliente sin establecer los valores iniciales.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase Cliente.
     *
     * @param nombre El nombre del cliente.
     * @param documento El documento de identificación del cliente.
     * @param telefono El teléfono del cliente.
     * @param direccion La dirección del cliente.
     * @param email El correo electrónico del cliente.
     * @param vetado Indica si el cliente está vetado o no.
     * @param rentados Lista de los items que el cliente ha rentado.
     */
    public Cliente(String nombre, long documento, String telefono, String direccion, String email, boolean vetado, ArrayList<ItemRentado> rentados) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.vetado = vetado;
        this.rentados = rentados;
    }

    /**
     * Constructor para crear un cliente sin especificar la lista de items rentados,
     * con el campo vetado configurado por defecto a false.
     *
     * @param nombre El nombre del cliente.
     * @param documento El documento de identificación del cliente.
     * @param telefono El teléfono del cliente.
     * @param direccion La dirección del cliente.
     * @param email El correo electrónico del cliente.
     */
    public Cliente(String nombre, long documento, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.vetado = false;  // El cliente no está vetado por defecto
        this.rentados = new ArrayList<>();  // Inicializa la lista de items rentados vacía
    }

    // Métodos getter y setter

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identificación del cliente.
     *
     * @return El documento de identificación del cliente.
     */
    public long getDocumento() {
        return documento;
    }

    /**
     * Establece el documento de identificación del cliente.
     *
     * @param documento El documento de identificación del cliente.
     */
    public void setDocumento(long documento) {
        this.documento = documento;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return El teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono El teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     *
     * @return El correo electrónico del cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del cliente.
     *
     * @param email El correo electrónico del cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Verifica si el cliente está vetado.
     *
     * @return true si el cliente está vetado, false de lo contrario.
     */
    public boolean isVetado() {
        return vetado;
    }

    /**
     * Establece si el cliente está vetado.
     *
     * @param vetado true si el cliente debe estar vetado, false de lo contrario.
     */
    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }

    /**
     * Obtiene la lista de items rentados por el cliente.
     *
     * @return Una lista de objetos `ItemRentado` que representan los items rentados por el cliente.
     */
    public ArrayList<ItemRentado> getRentados() {
        return rentados;
    }

    /**
     * Establece la lista de items rentados por el cliente.
     *
     * @param rentados La lista de objetos `ItemRentado` que representan los items rentados por el cliente.
     */
    public void setRentados(ArrayList<ItemRentado> rentados) {
        this.rentados = rentados;
    }

    /**
     * Devuelve una representación en cadena del cliente, incluyendo su nombre, documento y lista de items rentados.
     *
     * @return Una cadena que representa al cliente y sus items rentados.
     */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", rentados=\n\t" + rentados + '}';
    }
}
