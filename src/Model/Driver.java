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
public class Driver {  
    private String name;
    private String SIMnum;
    private int rentPrice;
    private boolean status;


    public Driver(String name, String SIMnum, int rentPrice, boolean status) {
        this.name = name;
        this.SIMnum = SIMnum;
        this.rentPrice = rentPrice;
        this.status = status;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSIMnum() {
        return SIMnum;
    }

    public void setSIMnum(String SIMnum) {
        this.SIMnum = SIMnum;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
