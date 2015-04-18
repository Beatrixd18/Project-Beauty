package ProjectBeauty.repository;


import ProjectBeauty.domain.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    public Invoice findByCode(String code);
}
