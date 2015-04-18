package ProjectBeauty.services.Impl;

import ProjectBeauty.domain.Procedures;
import ProjectBeauty.repository.ProcedureRepository;
import ProjectBeauty.services.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcedureServiceImpl implements ProcedureService{
    @Autowired
    ProcedureRepository repository;
    public List<Procedures> getProcedures(){
        List<Procedures> allprocedures = new ArrayList<Procedures>();

        Iterable<Procedures> procedures = repository.findAll();
        for(Procedures procedure : procedures) {
            allprocedures.add(procedure);
        }
        return  allprocedures;
    }
}
