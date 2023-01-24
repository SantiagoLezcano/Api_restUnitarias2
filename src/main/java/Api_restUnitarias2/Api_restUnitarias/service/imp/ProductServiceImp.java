package Api_restUnitarias2.Api_restUnitarias.service.imp;

import Api_restUnitarias2.Api_restUnitarias.Model.Product;
import Api_restUnitarias2.Api_restUnitarias.repository.ProductRepository;
import Api_restUnitarias2.Api_restUnitarias.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Estereotipos (component,service,repository,controller que, diferencia(capa) )
@Service //Component(servicios es para funcionalidades no propias de la clase) controller
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
