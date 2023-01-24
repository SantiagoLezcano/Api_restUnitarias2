package Api_restUnitarias2.Api_restUnitarias.service;

import Api_restUnitarias2.Api_restUnitarias.Model.Store;
import java.util.List;

public interface StoreService {

    void saveStore(Store store);

    void updateStore(Store store);

    void deleteStore(int id);

    List<Store> findAll();

}
