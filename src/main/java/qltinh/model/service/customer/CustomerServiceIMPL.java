package qltinh.model.service.customer;

import qltinh.entity.Customer;
import qltinh.entity.Province;
import qltinh.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findALl() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findByID(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
