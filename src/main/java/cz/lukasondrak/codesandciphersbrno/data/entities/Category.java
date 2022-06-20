package cz.lukasondrak.codesandciphersbrno.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public record Category(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id long id,
        String name) {
}
