/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {
    ArrayList<String>   allStrings  =   new ArrayList<>();
    
    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isConnected")
    public String isConnected() {
        System.out.println("[SERVER] - isConnected()");
        return "Connected";
    }

    /**
     * Web service operation
     * @param s1
     * @param s2
     * @return 
     */
    @WebMethod(operationName = "getLongestStringBetween")
    public String getLongestStringBetween(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) {
        System.out.println("[SERVER] - getLongestStringBetween(" + s1 + ", " + s2 + ")");
        if(s1.length() >= s2.length())
            return s1;
        else
            return s2;
    }

    /**
     * Web service operation
     * @param s1
     * @param s2
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "getLongestStringBetweenWithException")
    public String getLongestStringBetweenWithException(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) throws Exception {
        System.out.println("[SERVER] - getLongestStringBetweenWithException(" + s1 + ", " + s2 + ")");
        
        if(s1 == null)
            throw new Exception();
        
        if(s2 == null)
            throw new Exception();
        
        if(s1.length() >= s2.length())
            return s1;
        else
            return s2;
    }

    /**
     * Web service operation
     * @param s
     * @return 
     */
    @WebMethod(operationName = "addSampleOnServer")
    public Boolean addSampleOnServer(@WebParam(name = "s") String s) {
                System.out.println("[SERVER] - addSampleOnServer(" + s + ")");

                allStrings.add(s);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLongestStringOnServer")
    public String getLongestStringOnServer() {
                System.out.println("[SERVER] - getLongestStringOnServer()");
                
                String  longest =   allStrings.get(0);
                for(int i = 0; i < allStrings.size(); i++)
                {
                    if(allStrings.get(i).length() > longest.length())
                        longest = allStrings.get(i);
                }
        return longest;
    }
}
