/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aryan
 */
@WebService(serviceName = "MyCalculatorService")
public class MyCalculatorService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public double addition(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substraction")
    public double substraction(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }

    /**
     * This is a sample web service operation
     */
    
}
