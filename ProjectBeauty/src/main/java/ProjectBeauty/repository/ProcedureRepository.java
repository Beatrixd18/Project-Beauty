package ProjectBeauty.repository;


import ProjectBeauty.domain.Procedures;
import org.springframework.data.repository.CrudRepository;

public interface ProcedureRepository extends CrudRepository<Procedures,Long> {
    public Procedures findByCode(String code);
}
