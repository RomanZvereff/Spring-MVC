package org.dp.cinema.service;

import org.dp.cinema.dao.impl.CustomerDAOImpl;
import org.dp.cinema.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerRegistrationService {

    CustomerDAOImpl customerDAO;

    @Autowired
    public void setCustomerDAO(CustomerDAOImpl customerDAO) {
        this.customerDAO = customerDAO;
    }

    public Long setCustomerDetails(String firstname, String lastname) {
        CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerFirstName(firstname);
        customerModel.setCustomerLastName(lastname);
        return customerDAO.save(customerModel);
    }

}
