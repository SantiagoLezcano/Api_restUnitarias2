package Api_restUnitarias2.Api_restUnitarias.Controlador;

import Api_restUnitarias2.Api_restUnitarias.DAO.ProductoDAO;
import Api_restUnitarias2.Api_restUnitarias.Model.Producto;
import Api_restUnitarias2.Api_restUnitarias.Model.Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {


    @Autowired
    private ProductoDAO productoDAO;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Producto producto){
        productoDAO.save(producto);
    }


    @PutMapping("/actualizar")
    public void actualizar(@PathVariable Producto producto){
        productoDAO.save(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id){
        productoDAO.deleteById(id);
    }

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoDAO.findAll();
    }


}
