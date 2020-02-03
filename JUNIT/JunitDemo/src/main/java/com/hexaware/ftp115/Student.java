package com.hexaware.ftp115;
import java.security.AlgorithmParameterGenerator;
import java.util.Objects;

public class Student {
    private int sno;
    private String name;
    private String city;
    private double cgp;
    public Student(){

    }
    public Student(int argno, String argname, String arcity, double arcdp){
        this.sno = argno;
        this.name = argname;
        this.city =arcity;
        this.cgp=arcdp;
    }

    public int getSno() {
        return sno;
    }
    public void setSno(int argSno){
        this.sno = argSno;
    }
    public String getSname() {
        return name;
    }
    public void setName(String argSname){
        this.name = argSname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String argCity) {
        this.city = argCity;
    }

    public double getCgp() {
        return cgp;
    }
    
    public void setCgp(double argCgp) {
        this.cgp = argCgp;
    }
    @Override
    public final String toString(){
        return "sno " +sno+ " name " +name+" city " +city+ " cgp "+cgp;
    }

    @Override
    public final int hashCode(){
        return Objects.hash(sno, name, city, cgp);
    }

    @Override 
    public final boolean equals(Object ob) {
        Student s = (Student)ob;
        if (sno==s.getSno() && name==s.getSname() && cgp==s.getCgp() && city==s.getCity()) {
            return true;
        }
        else {
            return false;
        }
    }
}