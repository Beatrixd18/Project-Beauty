package ProjectBeauty.services.Impl;

import ProjectBeauty.domain.Equipment;
import ProjectBeauty.repository.EquipmentRepository;
import ProjectBeauty.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService{
    @Autowired
    EquipmentRepository repository;
    public List<Equipment> getEquipment(){
        List<Equipment> allequipment = new ArrayList<Equipment>();

        Iterable<Equipment> equipment = repository.findAll();
        for(Equipment equip : equipment){
            allequipment.add(equip);
        }
        return allequipment;
    }
}
