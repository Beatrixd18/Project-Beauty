package ProjectBeauty.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class Schedule implements Serializable{
    @OneToMany
    private int AppID;
    @OneToMany
    private int PId;
    @OneToMany
    private int EId;

    public Schedule(){

    }

    public Schedule(Builder builder){
        AppID = builder.AppID;
        PId = builder.PId;
        EId = builder.EId;
    }

    public int getPId() {
        return PId;
    }

    public int getAppID() {
        return AppID;
    }

    public int getEId() {
        return EId;
    }

    public static class Builder{
        private int AppID;
        private int PId;
        private int EId;

        public Builder(int AppDate){
            this.AppID = AppID;
        }

        public Builder PId(int value){
            this.PId = value;
            return this;
        }

        public Builder EId(int value){
            this.EId = value;
            return this;
        }

        public Schedule build(){
            return new Schedule(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (AppID != schedule.AppID) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return AppID;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "AppID=" + AppID +
                ", PId=" + PId +
                ", EId=" + EId +
                '}';
    }
}
