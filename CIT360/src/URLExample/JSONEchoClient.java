//package URLExample;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author tinkerc
// */
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class JSONEchoClient {
//    
//    public void go() {
//        while (true) {
//            try {
//                Scanner systemInScanner = new Scanner(System.in);
//                System.out.printf("Enter the message to send to the server.\n");
//                String messageForServer = systemInScanner.nextLine();
//                URL url = new URL("http://localhost:8080/json");
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setDoOutput(true);//allows POST
//
//                JSONReader outToServer = new JSONOutputStream(connection.getOutputStream());
//                HashMap<String, Object> request = new HashMap<>();
//                request.put("command", "Speak");
//                request.put("message", messageForServer);
//                outToServer.writeObject(request);
//
//                JSONInputStream inFromServer = new JSONInputStream(connection.getInputStream());
//                HashMap<String, Object> response = (HashMap<String, Object>) inFromServer.readObject();
//                if (response.get("command").equals("Done")) {
//                    System.out.println("Sent request: " + request + "and  got response  " + response);
//                } else {
//                    System.out.println("Oops. got " + response);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
