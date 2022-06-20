package cz.lukasondrak.codesandciphersbrno.data.repositories;

import cz.lukasondrak.codesandciphersbrno.data.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
