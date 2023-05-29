package qltinh.model.repository;

import qltinh.entity.Customer;
import qltinh.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
Iterable<Customer> findAllByProvince(Province province);
}
