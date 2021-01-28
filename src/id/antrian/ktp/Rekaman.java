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
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author AR
 */
public class Rekaman {
    private final IntegerProperty idrek;
    private final StringProperty classrek;
    private final StringProperty perekam;

    public Rekaman(Integer idrek, String classrek, String perekam) {
        this.idrek = new SimpleIntegerProperty(idrek);
        this.classrek = new SimpleStringProperty (classrek);
        this.perekam = new SimpleStringProperty (perekam);
    }

    public Integer getIdrek() {
        return idrek.get();
    }

    public void setIdrek(Integer idrek) {
        this.idrek.set(idrek);
    }

    public String getClassrek() {
        return classrek.get();
    }

    public void setClassrek(String classrek) {
        this.classrek.set(classrek);
    }

    public String getPerekam() {
        return perekam.get();
    }

    public void setPerekam(String perekam) {
        this.perekam.set(perekam);
    }
    
    public Integer getIdrekProperty() {
        return idrek.get();
    }
    
    public String getClassrekProperty() {
        return classrek.get();
    }

    public String getPerekamProperty() {
        return perekam.get();
    }   
}
