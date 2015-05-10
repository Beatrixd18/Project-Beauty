package ProjectBeauty.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Invoice implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IId;
    private int CId;
    private int invoiceNum;
    private double fee;

    private Invoice(){

    }

    public Invoice(Builder builder){
        IId = builder.IId;
        CId = builder.CId;
        invoiceNum = builder.invoiceNum;
        fee = builder.fee;
    }
    public int getIId() {
        return IId;
    }

    public int getCId() {
        return CId;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public double getFee() {
        return fee;
    }

    public static class Builder{
        private int IId;
        private int CId;
        private int invoiceNum;
        private double fee;

        public Builder(int IId){
            this.IId=IId;
        }

        public Builder CId(int value){
            this.CId = value;
            return this;
        }

        public Builder invoiceNum(int value){
            this.invoiceNum = value;
            return this;
        }

        public Builder fee(double value){
            this.fee = value;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (IId != invoice.IId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return IId;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "IId=" + IId +
                ", invoiceNum=" + invoiceNum +
                ", fee=" + fee +
                '}';
    }
}
