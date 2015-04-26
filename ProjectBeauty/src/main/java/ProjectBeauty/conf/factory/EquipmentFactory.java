package ProjectBeauty.conf.factory;


import ProjectBeauty.domain.Equipment;

public class EquipmentFactory {
    public static Equipment createEquipment(int idQ, String qname){
        Equipment equi = new Equipment.Builder(idQ).Qname("Qname").build();
        return equi;
    }
}
