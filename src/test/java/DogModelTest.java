import com.detroitlabs.DogBeautyPageant.model.DogModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogModelTest {


    @Test
    void shouldReturnDouble(){
        DogModel testDm = new DogModel();
        int result = testDm.placeMultiplier(2);
        assertEquals(result, 4);

    }
//    @Test
//    void getPlace() {
//        DogModel testDm = new DogModel();
//        int result = testDm.getPlace();
//        assertEquals(result, 2);
//    }

//    @Test
//    void setPlace() {
//        DogModel testDm = new DogModel();
//        int result = testDm.setPlace();
//        assertEquals(result, 2);
//    }
}