package ProjectBeauty.repository;


import ProjectBeauty.domain.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
    public Payment findByCode(String code);
}
