package ProjectBeauty.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Equipment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int QId;
    private String Qname;

    private Equipment(){

    }

    private Equipment(Builder builder){
        QId=builder.QId;
        Qname=builder.Qname;
    }

    public int getQId() {
        return QId;
    }

    public String getQname() {
        return Qname;
    }

    public static class Builder{
        private int QId;
        private String Qname;

        public Builder(int QId){
            this.QId=QId;
        }

        public Builder Qname(String value){
            this.Qname=value;
            return this;
        }

        public Equipment build(){
            return new Equipment(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        if (QId != equipment.QId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return QId;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "QId=" + QId +
                ", Qname='" + Qname + '\'' +
                '}';
    }
}
