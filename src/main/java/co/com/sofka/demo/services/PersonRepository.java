package co.com.sofka.demo.services;

import co.com.sofka.demo.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {
    Mono<Person> findByName(String name);
}

