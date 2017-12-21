/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Random;

/**
 *
 * @author Windows 8.1
 */
public class Merk {
    private String idMerk;
    private String name;
    private int i=1;

    public Merk(String idMerk, String name) {
        this.idMerk = idMerk;
        this.name = name;
    }

    public Merk(String name) {
        this.idMerk = RandomS()+RandomN();
        this.name = name;
    }
    
    protected String RandomS() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 2) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    
    protected String RandomN() {
        String SALTCHARS = "01234567";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 1) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

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
