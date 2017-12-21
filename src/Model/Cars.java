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
public class Cars implements Price{
    private String noplat;
    private boolean status;
    private Type type;
    private Merk merk;
    private double rentPrice;

    public Cars(String noplat, Type type, Merk merk, Double price,boolean status) {
        this.noplat = noplat;
        this.type = type;
        this.merk = merk;
        this.rentPrice = price;
        this.status = status;
    }

    public void setnoplat(String noplat) {
        this.noplat= noplat;
    }

    public String getNoplat() {
        return noplat;
    }
    
    public double getPrice() {
        return rentPrice;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public Type getType() {
        return type;
    }

    public Merk getMerk() {
        return merk;
    }

    @Override
    public void setPrice(double price) {
        
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setMerk(Merk merk) {
        this.merk = merk;
    }
    
}
