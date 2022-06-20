package cz.lukasondrak.codesandciphersbrno.data.repositories;

import cz.lukasondrak.codesandciphersbrno.data.entities.Code;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends CrudRepository<Code, Long> {
}