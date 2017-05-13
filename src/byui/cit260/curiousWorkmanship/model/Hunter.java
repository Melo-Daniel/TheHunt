/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Daniel Melo
 */
public class Hunter implements Serializable{
    private String name, descripdtion;
    private int dx,dy,level;

    public Hunter() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripdtion() {
        return descripdtion;
    }

    public void setDescripdtion(String descripdtion) {
        this.descripdtion = descripdtion;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.descripdtion);
        hash = 29 * hash + this.dx;
        hash = 29 * hash + this.dy;
        hash = 29 * hash + this.level;
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
        final Hunter other = (Hunter) obj;
        if (this.dx != other.dx) {
            return false;
        }
        if (this.dy != other.dy) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.descripdtion, other.descripdtion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hunter{" + "name=" + name + ", descripdtion=" + descripdtion + ", dx=" + dx + ", dy=" + dy + ", level=" + level + '}';
    }
    
}
