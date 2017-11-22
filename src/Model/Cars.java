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
    private String idCar;
    private boolean status;
    private Type type;
    private Merk merk;
    private double price;

    public Cars(String idCar, double rentPrice, Type type, Merk merk) {
        this.idCar = idCar;
        this.type = type;
        this.merk = merk;
        this.price = rentPrice;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdCar() {
        return idCar;
    }
    
    public double getPrice() {
        return price;
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
    public void setPrice(double price){
        
    }
    
}
