package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.repos;

import io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}
