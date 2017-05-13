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
public class Game implements Serializable{
    private long totalTime;
    private boolean noPeopple;

    public Game() {
    }
    
    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public boolean isNoPeopple() {
        return noPeopple;
    }

    public void setNoPeopple(boolean noPeopple) {
        this.noPeopple = noPeopple;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
        hash = 71 * hash + (this.noPeopple ? 1 : 0);
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.noPeopple != other.noPeopple) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeopple=" + noPeopple + '}';
    }
    
}
