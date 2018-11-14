/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tinkerc
 */
public class JsonImport {
    
    double checkingBalance;
    double savingsBalance;
    String accountHolder;
    boolean is_goldmember;
    
    public JsonImport() {
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public boolean getIs_goldmember() {
        return is_goldmember;
    }

    public void setIs_goldmember(boolean is_goldmember) {
        this.is_goldmember = is_goldmember;
    }
    
}
