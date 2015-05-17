package ProjectBeauty.api;

import ProjectBeauty.domain.Customers;
import ProjectBeauty.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/cusstomers/**")
public class CustomerPage {
    @Autowired
    private CustomerService customer;
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Customers getCustomers(){
        Customers custo = new Customers.Builder(123456).Cname("Caiden").Address("Riversdale").build();
        return custo;
    }
}
