package Api_restUnitarias2.Api_restUnitarias.Controlador;

import Api_restUnitarias2.Api_restUnitarias.DAO.TiendaDAO;
import Api_restUnitarias2.Api_restUnitarias.Model.Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tiendas")
public class TiendaControlador {


    @Autowired
    private TiendaDAO tiendaDAO;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Tienda tienda){
        tiendaDAO.save(tienda);
    }


    @PutMapping("/actualizar")
    public void actualizar(@PathVariable Tienda tienda){
        tiendaDAO.save(tienda);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id){
        tiendaDAO.deleteById(id);
    }

    @GetMapping("/listar")
    public List<Tienda> listar(){
        return tiendaDAO.findAll();
    }


}
