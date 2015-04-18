package ProjectBeauty.services.Impl;


import ProjectBeauty.domain.Employees;
import ProjectBeauty.repository.EmployeeRepository;
import ProjectBeauty.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository repository;
    public List<Employees> getEmployees(){
        List<Employees> allemployees = new ArrayList<Employees>();

        Iterable<Employees> employees = repository.findAll();
        for(Employees employee : employees){
            allemployees.add(employee);
        }
        return allemployees;
    }
}
