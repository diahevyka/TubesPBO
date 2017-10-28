/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import static Model.Price.price;
import java.util.Date;

/**
 *
 * @author Windows 8.1
 */
public class Lend {
    private String idLend;
    private Date lendDate;
    private Owner owner;
    private Cars car;

    public Lend(String idLend, Date lendDate, Owner owner, Cars car) {
        this.idLend = idLend;
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

    public Date getLendDate() {
        return lendDate;
    }
    
    public double getPrice() {
        return price;
    }
}
