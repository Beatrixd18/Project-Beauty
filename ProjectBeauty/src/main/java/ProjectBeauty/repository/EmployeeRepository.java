package ProjectBeauty.repository;


import ProjectBeauty.domain.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees,Long> {
    public Employees findByCode(String code);
}
