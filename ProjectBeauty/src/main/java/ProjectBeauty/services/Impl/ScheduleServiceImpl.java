package ProjectBeauty.services.Impl;

import ProjectBeauty.domain.Schedule;
import ProjectBeauty.repository.ScheduleRepository;
import ProjectBeauty.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    ScheduleRepository repository;
    public List<Schedule> getSchedule(){
        List<Schedule> allschedules = new ArrayList<Schedule>();

        Iterable<Schedule> schedule = repository.findAll();
        for(Schedule sched : schedule){
            allschedules.add(sched);
        }
        return allschedules;
    }
}
