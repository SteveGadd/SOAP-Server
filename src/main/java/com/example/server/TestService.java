package com.example.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
@WebService(serviceName = "Tester")
public class TestService {
    @WebMethod(operationName = "sendPerson")
    public Person send(String name,String surname,int TCKN){
        return new Person(name,surname,TCKN);
    }
}
