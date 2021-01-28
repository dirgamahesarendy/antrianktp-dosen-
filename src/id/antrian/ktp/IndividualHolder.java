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

public class IndividualHolder extends AccountHolder{
    public StringProperty status;
    
    public IndividualHolder(Integer holderID, String name, String address, String email,
            String status) {
        super(holderID, name, address, email);
        this.status = new SimpleStringProperty(status);
    }

    public String getStatus() {
        return status.get();
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}

