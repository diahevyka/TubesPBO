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
public class dDriver extends User{
    private String SIMnum;
    private double rentPrice;
    private int status = 0;


    public dDriver(String name, String address, String phone, String SIMnum, double rentPrice,int status) {
        super(name,address,phone);
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

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
