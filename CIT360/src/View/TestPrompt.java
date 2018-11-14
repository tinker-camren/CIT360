/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import cit360.CIT360;
import Model.MapExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author tinkerc
 */
public class TestPrompt {
    
    public HashMap promptUser() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out, true);
        MapExample mapExample = CIT360.getMapExample();
        HashMap map = new HashMap<>();
        
        try {
        System.out.println("Please enter a manager's name (Deborah Heart "
                + "or Rosco Williams)");
        String manager = input.readLine();
        System.out.println("Manager chosen: " + manager);
        Object employees = mapExample.getExampleMap().get(manager);
        map.put(manager, employees);
        
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        return map;
        
    }
}
