/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Windows 8.1
 */
public class Merk {
    private String idMerk;
    private String name;

    public Merk(String idMerk, String name) {
        this.idMerk = idMerk;
        this.name = name;
    }

    public void setIdMerk(String idMerk) {
        this.idMerk = idMerk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdMerk() {
        return idMerk;
    }

    public String getName() {
        return name;
    }
    
    
}
