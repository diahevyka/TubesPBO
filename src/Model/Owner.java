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
public class Owner extends User{
    private String noktp;
    private String email;

    public Owner(String noktp, String name, String email, String address, String phone) {  
        super(name, address, phone);   
        this.noktp = noktp;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoktp() {
        return this.noktp;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }

    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    
}
