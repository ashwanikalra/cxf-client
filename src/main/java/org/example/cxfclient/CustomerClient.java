package org.example.cxfclient;

import com.abc.customer.CustomerServicePortType;
import com.abc.customer.GetCustomerRequest;
import com.abc.customer.GetCustomerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerClient {

    private final CustomerServicePortType customerSoapClient;

    public CustomerClient(CustomerServicePortType customerSoapClient) {
        this.customerSoapClient = customerSoapClient;
    }


    public void callGetCustomer(GetCustomerRequest req) {

        GetCustomerResponse res = customerSoapClient.getCustomer(req);
        log.debug("Response from service - Customer First Name {}", res.getCustomer().getFirstname());
        log.debug(("Response from service - Customer Last Name : " + res.getCustomer().getLastname()));

    }

}
