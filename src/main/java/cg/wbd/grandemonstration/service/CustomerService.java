package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Page<Customer> findAll(Pageable pageInfo);

    Page<Customer> search(String keyword, Pageable pageInfo);

    void delete(Long id);

    Customer findById(Long id);


    Customer save(Customer customer);

    List<Customer> save(List<Customer> customers);

    boolean exists(Long id);

    List<Customer> search(String keyword);

    List<Customer> findAll(List<Long> ids);

    long count();

    void delete(Customer customer);

    void delete(List<Customer> customers);

    void deleteAll();
    //    Customer findOne(Long id);
}
