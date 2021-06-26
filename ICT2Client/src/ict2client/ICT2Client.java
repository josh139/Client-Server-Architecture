/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;

/**
 *
 * @author Gab
 */
public class ICT2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICT2Client client = new ICT2Client();
        client.execute();
    }

    private void execute() {
        System.out.println("[CLIENT] - Starting Test...");
        if (isConnected().equals("Connected")) {
            System.out.println("[CLIENT] - Server is connected, proceeding with the test...");
            String a = "aaa";
            String b = "aaaa";
            String c = getLongestStringBetween(a, b);
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            a = "bbb";
            b = "ccc";
            c = getLongestStringBetween(a, b);
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            a = "bbb";
            b = "ccc";
            try {
                c = getLongestStringBetweenWithException(a, b);
                System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            a = null;
            b = "ccc";
            try {
                c = getLongestStringBetweenWithException(a, b);
                System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            a = "bbb";
            b = null;
            try {
                c = getLongestStringBetweenWithException(a, b);
                System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            a = null;
            b = null;
            try {
                c = getLongestStringBetweenWithException(a, b);
                System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ICT2Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - " + c + " is longer or equal between " + a + " and " + b);

            String  s = "aaaa";
            addSampleOnServer(s);
            String  longest =  getLongestStringOnServer();
            System.out.println("[CLIENT] - " + longest + " is the longest string on server");
            s = "aaaaaaaaaaaxxxxxx";
            addSampleOnServer(s);
            longest =  getLongestStringOnServer();
            System.out.println("[CLIENT] - " + longest + " is the longest string on server");
            s = "b";
            addSampleOnServer(s);
            longest =  getLongestStringOnServer();
            System.out.println("[CLIENT] - " + longest + " is the longest string on server");
            
        } else {
            System.out.println("[CLIENT] - Server is NOT connected, test failed !");

        }
        System.out.println("[CLIENT] - Test Completed !");
    }

    private static String isConnected() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.isConnected();
    }

    private static String getLongestStringBetween(java.lang.String s1, java.lang.String s2) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getLongestStringBetween(s1, s2);
    }

    private static String getLongestStringBetweenWithException(java.lang.String s1, java.lang.String s2) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getLongestStringBetweenWithException(s1, s2);
    }

    private static Boolean addSampleOnServer(java.lang.String s) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.addSampleOnServer(s);
    }

    private static String getLongestStringOnServer() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getLongestStringOnServer();
    }

    
    
}
