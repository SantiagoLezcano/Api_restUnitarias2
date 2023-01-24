package Api_restUnitarias2.Api_restUnitarias.service.imp;

import Api_restUnitarias2.Api_restUnitarias.repository.StoreRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StoreServiceImpTest {

    @Mock
    private StoreRepository storeRepository;

    @InjectMocks
    private StoreServiceImp storeService;


    @Test
    public void testSaveStore(){
        storeService.saveStore(Mockito.any());
        Mockito.verify(storeRepository, Mockito.times(1)).save(Mockito.any());

    }
}