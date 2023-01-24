package Api_restUnitarias2.Api_restUnitarias.service.imp;

import Api_restUnitarias2.Api_restUnitarias.Model.Store;
import Api_restUnitarias2.Api_restUnitarias.repository.StoreRepository;
import Api_restUnitarias2.Api_restUnitarias.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImp implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public void saveStore(Store store) {
     storeRepository.save(store);
    }

    @Override
    public void updateStore(Store store) {
        storeRepository.save(store);
    }

    @Override
    public void deleteStore(int id) {
        storeRepository.deleteById(id);
    }

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }
}
