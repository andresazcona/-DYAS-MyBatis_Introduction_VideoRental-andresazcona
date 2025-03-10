package edu.unisabana.dyas.samples.services.client;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.unisabana.dyas.samples.entities.Item;
import edu.unisabana.dyas.samples.entities.TipoItem;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.IOException;

/**
 * Clase de ejemplo que utiliza MyBatis para realizar operaciones de base de datos.
 * En este caso, la clase permite insertar un nuevo `Item` en la base de datos
 * y luego consultarlo para verificar que la inserción se realizó correctamente.
 */
public class MyBatisExample {

    /**
     * Método que construye una fábrica de sesiones de MyBatis a partir del
     * archivo de configuración ubicado en src/main/resources.
     *
     * @return SqlSessionFactory que será utilizada para abrir sesiones de MyBatis.
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                // Carga el archivo de configuración mybatis-config.xml
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                // Construye la sesión de MyBatis
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                // Lanza una excepción si no se puede cargar el archivo de configuración
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    /**
     * Método principal para ejecutar el ejemplo de inserción y consulta de un `Item`.
     * Crea un objeto `Item`, lo inserta en la base de datos, luego recupera el mismo item
     * para verificar que la inserción fue exitosa.
     */
    public static void main(String args[]) {
        // Obtiene la fábrica de sesiones
        SqlSessionFactory sessionfact = getSqlSessionFactory();
        // Abre una nueva sesión
        SqlSession sqlss = sessionfact.openSession();

        // Crear un nuevo objeto Item
        ItemMapper im = sqlss.getMapper(ItemMapper.class);
        Item newItem = new Item();
        newItem.setNombre("Nuevo Item");  // Asigna el nombre del item
        newItem.setDescripcion("Descripción del nuevo item");  // Asigna la descripción
        newItem.setFechaLanzamiento(new java.util.Date());  // Asigna la fecha actual
        newItem.setTarifaxDia(5000);  // Asigna la tarifa por día
        newItem.setFormatoRenta("Diario");  // Asigna el formato de renta
        newItem.setGenero("Electrónica");  // Asigna el género del item

        // Crear y asignar un TipoItem al nuevo Item
        TipoItem tipoItem = new TipoItem();
        tipoItem.setId(1);  // Establece el id del tipo de item (suponiendo que ya existe en la base de datos)
        tipoItem.setDescripcion("Electrónico");  // Asigna la descripción del tipo de item
        newItem.setTipo(tipoItem);  // Asigna el tipo al item

        // Imprimir en consola el objeto Item que se va a insertar
        System.out.println("Insertando el siguiente Item:");
        System.out.println(newItem);

        // Insertar el nuevo item en la base de datos usando el método de MyBatis
        im.insertarItem(newItem);
        System.out.println("Item insertado correctamente.");

        // Asegurarse de que el id del nuevo item se ha actualizado automáticamente después de la inserción
        System.out.println("ID generado para el nuevo item: " + newItem.getId());

        // Confirmar la transacción
        sqlss.commit();

        // Verificar la inserción consultando el item recién insertado usando el id generado
        Item insertedItem = im.consultarItem(newItem.getId());  // Usamos el id generado por SQLite
        System.out.println("Item recuperado desde la base de datos:");
        System.out.println(insertedItem);

        // Cerrar la sesión de MyBatis
        sqlss.close();
    }
}
