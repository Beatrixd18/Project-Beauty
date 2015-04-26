package ProjectBeauty.domain;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Customers implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CId;
    private String Cname;
    private String Telephone;
    private String Address;
     private double balance;

    private Customers(){

    }

    private Customers(Builder builder){
        CId=builder.CId;
        Cname=builder.Cname;
        Telephone=builder.Telephone;
        Address=builder.Address;
        balance=builder.balance;
    }

    public int getCId() {
        return CId;
    }

    public String getCname() {
        return Cname;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getAddress() {
        return Address;
    }

    public double getBalance() {
        return balance;
    }

    public static class Builder{
        private int CId;
        private String Cname;
        private String Telephone;
        private String Address;
        private double balance;

        public Builder(int CId){
            this.CId = CId;
        }

        public Builder Cname(String value){
            this.Cname=value;
            return this;
        }

        public Builder Telephone(String value){
            this.Telephone=value;
            return this;
        }

        public Builder Address(String value){
            this.Address= value;
            return this;
        }

        public Builder balance(double value){
            this.balance=value;
            return this;
        }

        public Customers build(){
            return new Customers(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        if (CId != customers.CId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return CId;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "CId=" + CId +
                ", Cname='" + Cname + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", Address='" + Address + '\'' +
                ", balance=" + balance +
                '}';
    }
}
