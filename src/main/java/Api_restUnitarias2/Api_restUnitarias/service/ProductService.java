package Api_restUnitarias2.Api_restUnitarias.service;

import Api_restUnitarias2.Api_restUnitarias.Model.Product;

import java.util.List;

public interface ProductService {

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int id);

    List<Product> findAll();


}
