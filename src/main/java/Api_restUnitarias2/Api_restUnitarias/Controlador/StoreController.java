package Api_restUnitarias2.Api_restUnitarias.Controlador;

import Api_restUnitarias2.Api_restUnitarias.Model.Store;
import Api_restUnitarias2.Api_restUnitarias.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping
    public void save(@RequestBody Store store){
        storeService.saveStore(store);
    }

    @PutMapping
    public void update(@PathVariable Store store){
        storeService.updateStore(store);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        storeService.deleteStore(id);
    }

    @GetMapping
    public List<Store> findAll(){
        return storeService.findAll();
    }

}
