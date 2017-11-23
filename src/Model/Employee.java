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

    public Employee(String username, String password, String name, String email, String address, String phone, String idEmployee) {
        super(name, address, phone);
        account = new Account(username,password);
        this.email = email;
        setIdEmployee(idEmployee);
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
    
}
