package ProjectBeauty.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany
    private int AppID;
    private int CId;
    private Date AppDate;

    private Appointment(){

    }

    public Appointment(Builder builder){
        AppID=builder.AppID;
        CId= builder.CId;
        AppDate = builder.AppDate;
    }

    public int getAppID() {
        return AppID;
    }

    public int getCId() {
        return CId;
    }

    public Date getAppDate() {
        return AppDate;
    }

    public static class Builder{
        private int AppID;
        private int CId;
        private Date AppDate;

        public Builder(int AppID){
            this.AppID = AppID;

        }

        public Builder CId(int value){
            this.CId = value;
            return this;
        }

        public Builder AppDate(Date value){
            this.AppDate = value;
            return this;
        }

        public Appointment build(){return new Appointment(this);}
    }
}
