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
public class Rent implements Price{
    private String borrowDate;
    private String returnDate;
    private Customer customer;
    private Employee employee;
    private Cars car;
    private dDriver driver;
    private double price;
    
    
     public Rent(String borrowDate, String returnDate, Customer customer, Employee employee, Cars car, dDriver driver) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.employee = employee;
        this.car = car;
        this.driver = driver;
    }

    public Rent(String borrowDate, String returnDate, Customer customer, Employee employee, Cars car) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.employee = employee;
        this.car = car;
    }
    
    public Rent(String borrowDate, String returnDate, Customer customer, Employee employee, Cars car, int dur) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.employee = employee;
        this.car = car;
        this.price = dur*car.getPrice();
    }
    
     public Rent(String borrowDate, String returnDate, Customer customer, Employee employee, Cars car, int dur, dDriver dr) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.employee = employee;
        this.car = car;
        this.driver = dr;
        this.price = dur*car.getPrice() + dur*dr.getRentPrice();
    }
     
    

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Cars getCar() {
        return car;
    }

    public void setDriver(dDriver driver) {
        this.driver = driver;
    }

    public dDriver getDriver() {
        return driver;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
