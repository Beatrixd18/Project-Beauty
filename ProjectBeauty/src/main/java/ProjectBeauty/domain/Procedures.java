package ProjectBeauty.domain;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Procedures implements Serializable{
    private Long PId;
    private String Pname;
    private double price;
    private String Duration;

    public Procedures(){

    }

    public Procedures(Builder builder){
        PId=builder.PId;
        Pname=builder.Pname;
        price=builder.price;
        Duration=builder.Duration;
    }

    public Long getPId() {
        return PId;
    }

    public String getPname() {
        return Pname;
    }

    public double getPrice() {
        return price;
    }

    public String getDuration() {
        return Duration;
    }

    public static class Builder{
        private Long PId;
        private String Pname;
        private double price;
        private String Duration;

        public Builder(Long PId){
            this.PId=PId;
        }

        public Builder Pname(String value){
            this.Pname=value;
            return this;
        }

        public Builder price(double value){
            this.price=value;
            return this;
        }

        public Builder Duration(String value){
            this.Duration=value;
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

        if (PId != null ? !PId.equals(that.PId) : that.PId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return PId != null ? PId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Procedures{" +
                "PId=" + PId +
                ", Pname='" + Pname + '\'' +
                ", price=" + price +
                ", Duration='" + Duration + '\'' +
                '}';
    }
}
