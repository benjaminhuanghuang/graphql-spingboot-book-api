package graphqlspringbootbookapi.repository;

import graphqlspringbootbookapi.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Author, Long> {
}