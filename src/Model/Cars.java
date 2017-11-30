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

    public Cars(String idCar, double rentPrice, Type type, Merk merk) {
        this.idCar = idCar;
        
        this.type = type;
        this.merk = merk;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdCar() {
        return idCar;
    }
    
    public double getPrice() {
        return 0;
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
