package ProjectBeauty.conf.factory;


import ProjectBeauty.domain.Procedures;

import java.util.Map;

public class ProceduresFactory {
    public static Procedures createProcedure(int idP, Map<String,String>values, double pri){
        Procedures proce = new Procedures.Builder(idP).Pname("Pname").price(pri).Duration(values.get("Duration")).build();
        return proce;
    }
}
