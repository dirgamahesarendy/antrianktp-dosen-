/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.antrian.ktp;

/**
 *
 * @author Microsoft
 */
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class CorporateHolder extends AccountHolder {
    StringProperty statusrek;
    
    public CorporateHolder(Integer holderID, String name, String address, String email, 
            String statusrek) {
        super(holderID, name, address, email);
        this.statusrek= new SimpleStringProperty(statusrek);
    }

    public String getStatusrek() {
        return statusrek.get();
    }

    public void setStatusrek(String statusrek) {
        this.statusrek.set(statusrek);
    }
}

