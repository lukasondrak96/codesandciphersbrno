package cz.lukasondrak.codesandciphersbrno.data.repositories;

import cz.lukasondrak.codesandciphersbrno.data.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
