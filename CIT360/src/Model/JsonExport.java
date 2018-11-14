/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.json.simple.JSONObject;

/**
 *
 * @author tinkerc
 */
public class JsonExport {
    public JSONObject obj = new JSONObject();

    public JsonExport() {
    obj.put("Account Holder", "Greg Ryan");
    obj.put("Checking Balance", 1000.21);
    obj.put("Savings Balance", 10000.56);
    obj.put("is_goldmember", true);
    }
      
    public JSONObject getObj() {
        return obj;
    }

    public void setObj(JSONObject obj) {
        this.obj = obj;
    }

}
