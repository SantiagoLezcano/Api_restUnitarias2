package Api_restUnitarias2.Api_restUnitarias.DAO;

import Api_restUnitarias2.Api_restUnitarias.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDAO extends JpaRepository <Producto,Integer> {
}
