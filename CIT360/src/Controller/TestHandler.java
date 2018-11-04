/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author tinkerc
 */

public class TestHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        System.out.println("Received: " + dataMap + " based on user input");
    }
}

