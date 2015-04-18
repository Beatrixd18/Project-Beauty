package ProjectBeauty.repository;


import ProjectBeauty.domain.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<Equipment,Long> {
    public Equipment findByCode(String code);
}
