/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;

/**
 *
 * @author Daniel Melo
 */
public class Weapon implements Serializable{
    private double precision,demage;

    public Weapon() {
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public double getDemage() {
        return demage;
    }

    public void setDemage(double demage) {
        this.demage = demage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.precision) ^ (Double.doubleToLongBits(this.precision) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.demage) ^ (Double.doubleToLongBits(this.demage) >>> 32));
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
        final Weapon other = (Weapon) obj;
        if (Double.doubleToLongBits(this.precision) != Double.doubleToLongBits(other.precision)) {
            return false;
        }
        if (Double.doubleToLongBits(this.demage) != Double.doubleToLongBits(other.demage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "precision=" + precision + ", demage=" + demage + '}';
    }
}
