package ProjectBeauty.domain;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Employees implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Ename;
    private String job;

   private Employees(){

   }

    public Employees(Builder builder) {
        id=builder.id;
        Ename=builder.Ename;
        job=builder.job;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return Ename;
    }

    public String getJob() {
        return job;
    }

    public static class Builder{
        private int id;
        private String Ename;
        private String job;

        public Builder(int id){
            this.id = id;
        }

        public Builder Ename(String value){
            this.Ename=value;
            return this;
        }

        public Builder job(String value){
            this.job=value;
            return this;
        }

        public Employees build(){
            return new Employees(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (id != employees.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", Ename='" + Ename + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
