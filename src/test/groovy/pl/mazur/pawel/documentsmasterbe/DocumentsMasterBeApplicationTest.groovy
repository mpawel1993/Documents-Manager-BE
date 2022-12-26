package pl.mazur.pawel.documentsmasterbe

import org.junit.ClassRule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.spock.Testcontainers
import pl.mazur.pawel.documentsmasterbe.repository.DocumentRepository
import spock.lang.Shared
import spock.lang.Specification

@Testcontainers
@SpringBootTest
@ActiveProfiles('test')
class DocumentsMasterBeApplicationTest extends Specification{

    @Autowired
    DocumentRepository documentRepository;

    @Shared
    PostgreSQLContainer container = new PostgreSQLContainer("postgres:15.1")
            .withDatabaseName("DB_URL")
            .withUsername("DB_USERNAME")
            .withPassword("DB_PASSWORD")

    def setupSpec(){
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    def "Main"() {
        when:
        def result = documentRepository.findAll()

        then:
        result.isEmpty()
    }
}
