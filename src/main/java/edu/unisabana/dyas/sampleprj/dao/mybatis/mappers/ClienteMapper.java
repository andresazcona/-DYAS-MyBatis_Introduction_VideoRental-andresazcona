package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.unisabana.dyas.samples.entities.Cliente;

/**
 * Interfaz que define los métodos de acceso a los datos relacionados con los clientes
 * en la base de datos. Utiliza MyBatis para mapear las operaciones SQL a objetos Java.
 *
 * @author cesarvefe & andresazcona
 */
public interface ClienteMapper {

    /**
     * Consulta un cliente por su identificador único (ID).
     *
     * Este método ejecuta una consulta SQL para recuperar los datos de un cliente
     * basado en su ID. La anotación @Param se usa para asociar el parámetro 'idcli'
     * con el valor en la consulta SQL.
     *
     * @param idcli El ID del cliente que se desea consultar.
     * @return Un objeto Cliente con los datos del cliente encontrado o null si no se encuentra.
     */
    public Cliente consultarCliente(@Param("idcli") int id);

    /**
     * Agrega un item rentado a un cliente.
     *
     * Este método ejecuta una inserción SQL para agregar un nuevo item rentado
     * asociado a un cliente. Recibe el ID del cliente, el ID del item rentado,
     * y las fechas de inicio y fin de la renta.
     *
     * @param id El ID del cliente al que se le agregará el item rentado.
     * @param idit El ID del item rentado que se asociará al cliente.
     * @param fechainicio La fecha de inicio de la renta del item.
     * @param fechafin La fecha de fin de la renta del item.
     */
    public void agregarItemRentadoACliente(int id,
                                           int idit,
                                           Date fechainicio,
                                           Date fechafin);

    /**
     * Consulta todos los clientes registrados en la base de datos.
     *
     * Este método ejecuta una consulta SQL que recupera todos los clientes
     * registrados en la base de datos. Devuelve una lista de objetos Cliente.
     *
     * @return Una lista de objetos Cliente que representa todos los clientes en la base de datos.
     */
    public List<Cliente> consultarClientes();
}
