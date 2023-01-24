package Api_restUnitarias2.Api_restUnitarias;

import Api_restUnitarias2.Api_restUnitarias.repository.StoreRepository;
import Api_restUnitarias2.Api_restUnitarias.Model.Store;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestStore {

    @Autowired
    private StoreRepository storeRepository;


    @Test
    public void testGuardarTienda() {
//        Set<Producto> productos=new HashSet<> ();
//        Producto producto1= new Producto(1,"azucar2",10);
//        Producto producto2= new Producto(2,"azucar",10);
//        Producto producto3= new Producto(13,"azucar",10);
//        productos.add(producto1);
//        productos.add(producto2);
//        productos.add(producto3);
        Store store = new Store(1,"Exito","cra 87 # 12 32",123465789);

        Store storeGuardada = storeRepository.save(store);

        assertNotNull(storeGuardada);
    }

//    @Test
//    public void testBuscarTiendaPorNombre(){
//        String nombre="Exito";
//        Tienda tienda=tiendaDAO.findByNombre(nombre);
//
//        assertThat(tienda.getNombre()).isEqualTo(nombre);
//    }


  /*  @Test
    public void testActualizarProducto(){
        String nombreTienda="Olimpica";
        Store store =new Store(3,nombreTienda,"cra 87 # 12 32",123465789);
        store.setNit(3);

        storeRepository.save(store);
        Store storeActualizada = storeRepository.findById(nombreTienda);

        assertThat(storeActualizada.getNombre()).isEqualTo(nombreTienda);

    }*/

    @Test
    public void testListarTiendas(){
        List<Store> stores = storeRepository.findAll();

        System.out.println("size = " + stores.size());
        assertThat(stores).size().isGreaterThan(0);
    }


    @Test
    public void testEliminarTienda(){
        int nit=3;

        boolean existeTienda= storeRepository.findById(nit).isPresent();
        storeRepository.deleteById(nit);
        boolean noExisteTienda= storeRepository.findById(nit).isPresent();

        assertTrue(existeTienda);
        assertFalse(noExisteTienda);
    }

}
