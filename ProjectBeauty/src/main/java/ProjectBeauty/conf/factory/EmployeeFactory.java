package ProjectBeauty.conf.factory;


import ProjectBeauty.domain.Employees;

import java.util.Map;

public class EmployeeFactory {
    public static Employees createEmployee(int idE, Map<String,String>values){
        Employees emp = new Employees.Builder(idE).Ename(values.get("Ename")).job(values.get("job")).build();
        return emp;
    }
}
