package com.myapp.struts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author tinkerc
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String email;
    private String error;

    /**
     * @return
     */
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getError() {
        return error;
    }    

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setError() {
        this.error = "<span style='color:red'>Input validation failed. Please ensure that you're filling out both fields and using a full email address.</span>";
    }
    
    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
