package ProjectBeauty.api;

import ProjectBeauty.domain.Customers;
import ProjectBeauty.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by student on 2015/04/15.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private CustomerService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "Home Page";
    }

    @RequestMapping(value = "/cust",method = RequestMethod.GET)
    public Customers getCustomers(){
        Customers custo = new Customers.Builder(123456).Cname("Caiden").Address("Riversdale").build();
        return custo;
    }

    /*@RequestMapping(value = "/cust", method = RequestMethod.GET)
    public List<Customers> getCustomers(){

        return service.getCustomers();
    }*/
}
