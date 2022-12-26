package pl.mazur.pawel.documentsmasterbe.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mazur.pawel.documentsmasterbe.domain.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

}
