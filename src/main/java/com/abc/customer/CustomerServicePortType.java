package com.abc.customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-08-14T15:36:58.959+05:30
 * Generated source version: 3.5.3
 *
 */
@WebService(targetNamespace = "http://www.abc.com/customer", name = "CustomerServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerServicePortType {

    @WebMethod(operationName = "GetCustomer", action = "http://www.abc.com/customer/GetCustomer")
    @WebResult(name = "GetCustomerResponse", targetNamespace = "http://www.abc.com/customer", partName = "parameters")
    public GetCustomerResponse getCustomer(

        @WebParam(partName = "parameters", name = "GetCustomerRequest", targetNamespace = "http://www.abc.com/customer")
        GetCustomerRequest parameters
    );
}
