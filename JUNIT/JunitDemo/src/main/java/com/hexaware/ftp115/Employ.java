package com.hexaware.ftp115;
import java.util.Objects;
public class Employ {
    int empno;
    String name;
    double basic;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int argEmpno){
        this.empno = argEmpno;
    }

    public String getName() {
        return name;
    }

    public void setName(String argName) {
        this.name = argName;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double argBasic){
        this.basic =argBasic;
    }

    @Override
    public final int hashCode(){
        return Objects.hash(empno, name, basic);
    }
    public Employ() {

    }
    public Employ(int argEmpno, String argName, double argbasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.basic = argbasic;

       }

    @Override
    public final String toString(){
        return "Empno " +empno+ " Name "+name+ " Basic "+basic;
    }

}