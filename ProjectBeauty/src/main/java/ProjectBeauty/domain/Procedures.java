package ProjectBeauty.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Procedures implements Serializable{
    private int PId;
    private String Pname;
    @OneToMany
    private int QId;
    private double price;
    private String Duration;

    public Procedures(){

    }

    public Procedures(Builder builder){
        PId = builder.PId;
        Pname = builder.Pname;
        QId = builder.QId;
        price = builder.price;
        Duration = builder.Duration;
    }

    public int getPId() {
        return PId;
    }

    public String getPname() {
        return Pname;
    }

    public int getQId() {
        return QId;
    }

    public double getPrice() {
        return price;
    }

    public String getDuration() {
        return Duration;
    }

    public static class Builder{
        private int PId;
        private String Pname;
        private int QId;
        private double price;
        private String Duration;

        public Builder(int PId){
            this.PId=PId;
        }

        public Builder Pname(String value){
            this.Pname = value;
            return this;
        }

        public Builder QId(int value){
            this.QId = value;
            return this;
        }

        public Builder price(double value){
            this.price = value;
            return this;
        }

        public Builder Duration(String value){
            this.Duration = value;
            return this;
        }

        public Procedures build(){
            return new Procedures(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Procedures that = (Procedures) o;

        if (PId != that.PId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return PId;
    }

    @Override
    public String toString() {
        return "Procedures{" +
                "PId=" + PId +
                ", Pname='" + Pname + '\'' +
                ", QId=" + QId +
                ", price=" + price +
                ", Duration='" + Duration + '\'' +
                '}';
    }
}
