package ProjectBeauty.repository;


import ProjectBeauty.domain.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule,Long>{
    public Schedule findByCode(String code);
}
