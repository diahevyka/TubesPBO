/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;

/**
 *
 * @author Windows 8.1
 */
public class Lend implements Price {
    private String idLend;
    private String lendDate;
    private Owner owner;
    private Cars car;
    private double price;

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public Lend(String lendDate, Owner owner, Cars car) {
        this.lendDate = lendDate;
        this.owner = owner;
        this.car = car;
    }

    public String getIdLend() {
        return idLend;
    }

    public void setIdLend(String idLend) {
        this.idLend = idLend;
    }

    public String getLendDate() {
        return lendDate;
    }
    
   
    
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
