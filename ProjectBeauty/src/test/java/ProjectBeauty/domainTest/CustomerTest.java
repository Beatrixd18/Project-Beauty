package ProjectBeauty.domainTest;


import ProjectBeauty.conf.factory.CustomerFactory;
import ProjectBeauty.domain.Customers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateCustomer() throws Exception {
        Map<String, String> values = new HashMap<String,String>();
        values.put("Cname", "Annabelle");
        values.put("Telephone","021056315");
        String Addr="76 Pearl Street";
        double ba = 56767;
        Customers cus = CustomerFactory.createCustomer(45,values, Addr, ba );
        Assert.assertEquals("Annabelle", cus.getCname());
   }

    @After
    public void tearDown() throws Exception {


    }
}
