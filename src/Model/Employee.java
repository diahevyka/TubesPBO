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
public class Employee extends User{
    private String idEmployee;
    private String email;
    private Account account;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(String username, String password, String name, String email, String address, String phone) {
        super(name, address, phone);
        account = new Account(username,password);
        this.email = email;
    }

    public String getIdEmployee() {
        return idEmployee;
    }
    
    public void setIdEmployee(String idEmployee){
        this.idEmployee = idEmployee;
    }
    
    public Account getAccount(){
        return account;
    }
    
    public String getEmail(){
        return email;
    }
    
    
}
