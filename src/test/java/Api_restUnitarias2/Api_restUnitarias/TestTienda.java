package Api_restUnitarias2.Api_restUnitarias;

import Api_restUnitarias2.Api_restUnitarias.DAO.TiendaDAO;
import Api_restUnitarias2.Api_restUnitarias.Model.Producto;
import Api_restUnitarias2.Api_restUnitarias.Model.Tienda;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestTienda {

    @Autowired
    private TiendaDAO tiendaDAO;


    @Test
    public void testGuardarTienda() {
//        Set<Producto> productos=new HashSet<> ();
//        Producto producto1= new Producto(1,"azucar2",10);
//        Producto producto2= new Producto(2,"azucar",10);
//        Producto producto3= new Producto(13,"azucar",10);
//        productos.add(producto1);
//        productos.add(producto2);
//        productos.add(producto3);
        Tienda tienda = new Tienda(1,"Exito","cra 87 # 12 32",123465789);

        Tienda tiendaGuardada=tiendaDAO.save(tienda);

        assertNotNull(tiendaGuardada);
    }

//    @Test
//    public void testBuscarTiendaPorNombre(){
//        String nombre="Exito";
//        Tienda tienda=tiendaDAO.findByNombre(nombre);
//
//        assertThat(tienda.getNombre()).isEqualTo(nombre);
//    }

    @Test
    public void testActualizarProducto(){
        String nombreTienda="Olimpica";
        Tienda tienda=new Tienda(3,nombreTienda,"cra 87 # 12 32",123465789);
        tienda.setNit(3);

        tiendaDAO.save(tienda);
        Tienda tiendaActualizada= tiendaDAO.findByNombre(nombreTienda);

        assertThat(tiendaActualizada.getNombre()).isEqualTo(nombreTienda);

    }

    @Test
    public void testListarTiendas(){
        List<Tienda> tiendas= tiendaDAO.findAll();

        System.out.println("size = " + tiendas.size());
        assertThat(tiendas).size().isGreaterThan(0);
    }


    @Test
    public void testEliminarTienda(){
        int nit=3;

        boolean existeTienda= tiendaDAO.findById(nit).isPresent();
        tiendaDAO.deleteById(nit);
        boolean noExisteTienda=tiendaDAO.findById(nit).isPresent();

        assertTrue(existeTienda);
        assertFalse(noExisteTienda);
    }


}
