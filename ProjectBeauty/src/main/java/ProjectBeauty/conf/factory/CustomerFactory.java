package ProjectBeauty.conf.factory;

import ProjectBeauty.domain.Customers;

import java.util.Map;

public class CustomerFactory {
    public static Customers createCustomer(int idF, Map<String,String> values, String address, double bal){
        Customers cust = new Customers.Builder(idF).Cname(values.get("Cname")).Telephone(values.get("Telephone"))
                .Address(address).balance(bal).build();
        return cust;
    }


}
