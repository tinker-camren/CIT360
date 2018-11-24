/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author tinkerc
 */
public class JUnitExampleModel {
    int aee;
    int[] aaee;
    int afe;
    int anne;
    int anse;
    String ane; 
    int ase1;
    int ase2;
    int ate1;
    int ate2;
    int assertTrue;

    public JUnitExampleModel() {
    }

    public int getAssertTrue() {
        return assertTrue;
    }

    public void setAssertTrue(int assertTrue) {
        this.assertTrue = assertTrue;
    }
    
    public int getAee() {
        return aee;
    }

    public void setAee(int aee) {
        this.aee = aee;
    }

    public int[] getAaee() {
        return aaee;
    }

    public void setAaee(int[] aaee) {
        this.aaee = aaee;
    }

    public int getAfe() {
        return afe;
    }

    public void setAfe(int afe) {
        this.afe = afe;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    public int getAnse() {
        return anse;
    }

    public void setAnse(int anse) {
        this.anse = anse;
    }

    public String getAne() {
        return ane;
    }

    public void setAne(String ane) {
        this.ane = ane;
    }

    public int getAse1() {
        return ase1;
    }

    public void setAse1(int ase1) {
        this.ase1 = ase1;
    }

    public int getAse2() {
        return ase2;
    }

    public void setAse2(int ase2) {
        this.ase2 = ase2;
    }

    public int getAte1() {
        return ate1;
    }

    public void setAte1(int ate1) {
        this.ate1 = ate1;
    }

    public int getAte2() {
        return ate2;
    }

    public void setAte2(int ate2) {
        this.ate2 = ate2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.aee;
        hash = 53 * hash + Arrays.hashCode(this.aaee);
        hash = 53 * hash + this.afe;
        hash = 53 * hash + this.anne;
        hash = 53 * hash + this.anse;
        hash = 53 * hash + Objects.hashCode(this.ane);
        hash = 53 * hash + this.ase1;
        hash = 53 * hash + this.ase2;
        hash = 53 * hash + this.ate1;
        hash = 53 * hash + this.ate2;
        hash = 53 * hash + this.assertTrue;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JUnitExampleModel other = (JUnitExampleModel) obj;
        if (this.aee != other.aee) {
            return false;
        }
        if (this.afe != other.afe) {
            return false;
        }
        if (this.anne != other.anne) {
            return false;
        }
        if (this.anse != other.anse) {
            return false;
        }
        if (this.ase1 != other.ase1) {
            return false;
        }
        if (this.ase2 != other.ase2) {
            return false;
        }
        if (this.ate1 != other.ate1) {
            return false;
        }
        if (this.ate2 != other.ate2) {
            return false;
        }
        if (this.assertTrue != other.assertTrue) {
            return false;
        }
        if (!Objects.equals(this.ane, other.ane)) {
            return false;
        }
        if (!Arrays.equals(this.aaee, other.aaee)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JUnitExampleModel{" + "aee=" + aee + ", aaee=" + aaee + ", afe=" + afe + ", anne=" + anne + ", anse=" + anse + ", ane=" + ane + ", ase1=" + ase1 + ", ase2=" + ase2 + ", ate1=" + ate1 + ", ate2=" + ate2 + ", assertTrue=" + assertTrue + '}';
    }

    
}
