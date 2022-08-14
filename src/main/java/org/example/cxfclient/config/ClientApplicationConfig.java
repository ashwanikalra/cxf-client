package org.example.cxfclient.config;


import com.abc.customer.CustomerServicePortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientApplicationConfig {

    @Bean(name = "customerSoapClient")
    public CustomerServicePortType customerSoapClient() {
        JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
        jaxWsProxyFactory.setServiceClass(CustomerServicePortType.class);
        jaxWsProxyFactory.setAddress("http://localhost:8081/soap/service/customer");
        return jaxWsProxyFactory.create(CustomerServicePortType.class);
    }
}
