package sw;

import Clases.Clasificacion;
import Clases.Competencia;
import Clases.Factura;
import Clases.Item_Factura;
import Clases.Persona;
import Clases.Producto;
import Clases.Proveedores;
import Clases.Rol;
import Clases.Tipo_Pago;

import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    //private List<Competencia> bdTablaCompetencias = new ArrayList<>();
    private List<Rol> bdTablaRoles = new ArrayList<>();
    private List<Usuario> bdTablaUsuarios = new ArrayList<>();
    private List<Factura> bdTablafacturas = new ArrayList<>();
    private List<Persona> bdTablapersonas = new ArrayList<>();
    private List<Item_Factura> bdTablaItemFacturas = new ArrayList<>();

    public void cargarDatos() {
        Competencia c1 = new Competencia(1, "CREAR", "Crear productos en el sistema");
        Competencia c2 = new Competencia(2, "EDITAR", "Editar productos en el sistema");
        Competencia c3 = new Competencia(3, "ELIMINAR", "Eliminar productos en el sistema");
        Competencia c4 = new Competencia(4, "VISUALIZAR", "Visualizar productos en el sistema");
//        bdTablaCompetencias.add(c1);
//        bdTablaCompetencias.add(c2);
//        bdTablaCompetencias.add(c3);
//        bdTablaCompetencias.add(c4);

        Rol rol1 = new Rol(1, "ADMINISTRADOR", "Acceso general al sistema");
        rol1.agregarCompetencia(c1);
        rol1.agregarCompetencia(c2);
        rol1.agregarCompetencia(c3);
        bdTablaRoles.add(rol1);

        Rol rol2 = new Rol(2, "GESTION", "Acceso determinado al sistema");
        rol2.agregarCompetencia(c1);
        rol2.agregarCompetencia(c2);
        rol2.agregarCompetencia(c3);
        rol2.agregarCompetencia(c4);
        bdTablaRoles.add(rol2);

        //USUARIO 1
        Usuario u1 = new Usuario(1, new Persona(1, "Juan", "Perez", "123456789", "0987654321", "juan@example.com"), "Erick", "pass1");
        u1.agregarRol(rol1);
        bdTablaUsuarios.add(u1);

        //USUARIO 2
        Usuario u2 = new Usuario(2, new Persona(2, "Maria", "Lopez", "987654321", "0123456789", "maria@example.com"), "Isaac", "pass2");
        u2.agregarRol(rol2);
        bdTablaUsuarios.add(u2);

        //CREAMOS UNA CLASIFICACION
        Clasificacion clas1 = new Clasificacion(1, "PRODUCTOS VEGETALES");
        Clasificacion clas2 = new Clasificacion(2, "CARNES");

        //CREAMOS PROVEDORES
        Proveedores pro1 = new Proveedores(1, "01010101001", "0981434242", "ECUADOR", "erick@gmail.com", "Ecuro");
        Proveedores pro2 = new Proveedores(2, "01010101001", "0981434242", "PERU", "erick@gmail.com", "Ecuro");

        //CREAMOS PRODUCTOS 
        Producto produc1 = new Producto(1, 20, 2.20, "UNIDAD 1", clas1, pro1, true);
        Producto produc2 = new Producto(2, 20, 2.20, "UNIDAD 2", clas2, pro2, false);

        //Relacion tipoo de pago 
        Tipo_Pago tipop1 = new Tipo_Pago(1, "Efectivo", "Realizado ");
        Tipo_Pago tipop2 = new Tipo_Pago(2, "Efectivo", "Realizado ");
        Tipo_Pago tipop3 = new Tipo_Pago(3, "Efectivo", "Realizado ");

        Persona pers1 = new Persona(3, "Erick", "Guarango", "01069448995", "0987654321", "juan@example.com");
        bdTablapersonas.add(pers1);

        Persona pers2 = new Persona(4, "Isac", "Villa", "0106944896", "0987654321", "juan@example.com");
        bdTablapersonas.add(pers2);

        Factura fac1 = new Factura(1, "010121212", pers1, new Date(), tipop1, 0.12, 50.23);
        fac1.agregarPersona(pers1);

        Factura fac2 = new Factura(2, "010121212", pers2, new Date(), tipop2, 0.75, 30.23);
        fac2.agregarPersona(pers2);

        pers1.agregarFactura(fac1);
        pers2.agregarFactura(fac2);
        bdTablafacturas.add(fac1);
        bdTablafacturas.add(fac2);

        // Creamos los ítems y los vinculamos con las facturas
        Item_Factura item1 = new Item_Factura(1, null, produc1, 3, 5.23, 33.00);
        Item_Factura item2 = new Item_Factura(2, null, produc2, 3, 6.23, 66.00);

         // Vincular ítems con sus respectivas facturas
        fac1.agregarItem(item1);
        fac2.agregarItem(item2);

        // Agregar los ítems a la base de datos
        bdTablaItemFacturas.add(item1);
        bdTablaItemFacturas.add(item2);

//        //Creamos un item
//        Item_Factura item1 = new Item_Factura(1, fac1, produc1, 3, 5.23, 33.00);
//        Item_Factura item2 = new Item_Factura(2, fac2, produc2, 3, 6.23, 66.00);
//
//
////  SEERVICO PARA RELACION DE FACTURAS 
//        item1.agregarfactura(fac1);
//        bdTablaItemFacturas.add(item1);
//        item2.agregarfactura(fac2);
//        bdTablaItemFacturas.add(item2);
//        
//        
//        //******************
//        fac1.agregarItem(item2);
//        fac2.agregarItem(item2);
//        bdTablafacturas.add(fac1);
//        bdTablafacturas.add(fac2);
    }

    @WebMethod(operationName = "validarFacturas")
    public List<Factura> validarFacturas(@WebParam(name = "dni") String dni) {
        cargarDatos(); // Cargar los datos de ejemplo
        Persona personaEncontrada = null;

        // Buscar la persona por cédula
        for (Persona persona : bdTablapersonas) {
            if (persona.getDni().equals(dni)) {
                personaEncontrada = persona;
                break;
            }
        }

        // Retornar sus facturas o una lista vacía
        return (personaEncontrada != null) ? personaEncontrada.getFacturas() : new ArrayList<>();
    }

    @WebMethod(operationName = "validarCredenciales")
    public List<Rol> credenciales(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        cargarDatos(); //  carga los usuarios
        Usuario usuarioEncontrad = null;

        // Buscar el usuario por sus credenciales
        for (Usuario usew : bdTablaUsuarios) {
            if (usew.siExiste(usuario, password)) { // Llamada correcta al método siExiste
                usuarioEncontrad = usew;
                break;
            }
        }
        //Retornar su lista de roles o retorna una lista vacía
        return (usuarioEncontrad != null) ? usuarioEncontrad.getRoles() : new ArrayList<>();
    }

}
