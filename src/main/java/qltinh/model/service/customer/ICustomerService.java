package qltinh.model.service.customer;

import qltinh.entity.Customer;
import qltinh.entity.Province;
import qltinh.model.service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
