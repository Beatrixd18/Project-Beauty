package ProjectBeauty.repository;


import ProjectBeauty.domain.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers,Long> {
    public Customers findByCode(String code);
}
