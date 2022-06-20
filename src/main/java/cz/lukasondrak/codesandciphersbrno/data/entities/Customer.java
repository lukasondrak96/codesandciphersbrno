package cz.lukasondrak.codesandciphersbrno.data.entities;

import jakarta.persistence.*;

@Entity
public record Customer(
        @GeneratedValue(strategy = GenerationType.AUTO)
        @SequenceGenerator(name="customer_generator", sequenceName = "customer_seq")
        @Id Long id,
        String name,
        String surname,
        String email,
        String password) {
}
