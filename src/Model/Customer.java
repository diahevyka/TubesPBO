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
public class Customer extends User{
    private String idCustomer;

    public Customer(String idCustomer, String name, String address, String phone) {
        this.idCustomer = idCustomer;
        super(name, address, phone);
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    
}
