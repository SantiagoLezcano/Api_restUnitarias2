package Api_restUnitarias2.Api_restUnitarias.DAO;

import Api_restUnitarias2.Api_restUnitarias.Model.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiendaDAO extends JpaRepository <Tienda,Integer> {
    public Tienda findByNombre(String nombre);

}
