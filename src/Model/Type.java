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
public class Type {
    private String idType;
    private String name;

    public Type(String idType, String name) {
        this.idType = idType;
        this.name = name;
    }
    
    public String getidType() {
        return idType;
    }
    
    public String getName() {
        return name;
    }
}
