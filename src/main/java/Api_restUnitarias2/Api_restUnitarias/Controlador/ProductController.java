package Api_restUnitarias2.Api_restUnitarias.Controlador;

import Api_restUnitarias2.Api_restUnitarias.Model.Product;
import Api_restUnitarias2.Api_restUnitarias.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")//Singular
public class ProductController {//Un controlador no accede a bd, siempre llama service

    @Autowired
    private ProductService productService;

    @PostMapping
    public void save(@RequestBody Product product){//nueva cappa DTO mapStruc
        productService.saveProduct(product);
    }

    @PutMapping
    public void update(@PathVariable Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.deleteProduct(id);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

}
