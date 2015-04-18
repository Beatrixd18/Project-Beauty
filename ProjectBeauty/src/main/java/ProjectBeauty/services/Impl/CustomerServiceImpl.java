package ProjectBeauty.services.Impl;

import ProjectBeauty.domain.Customers;
import ProjectBeauty.repository.CustomerRepository;
import ProjectBeauty.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository repository;
    public List<Customers> getCustomers(){
        List<Customers> allcustomers = new ArrayList<Customers>();

        Iterable<Customers> customers = repository.findAll();
        for(Customers customer : customers){
            allcustomers.add(customer);
        }
        return allcustomers;
    }
}
