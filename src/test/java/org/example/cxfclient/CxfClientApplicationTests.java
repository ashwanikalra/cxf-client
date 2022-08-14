package org.example.cxfclient;

import com.abc.customer.GetCustomerRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CxfClientApplicationTests {

    @Autowired
    private CustomerClient customerClient;


    @Test
    void testCustomerService() {
        GetCustomerRequest req = new GetCustomerRequest();
        //put anything as response is hardcoded from other service.
        req.setFirstname("mac");
        customerClient.callGetCustomer(req);
    }

}
