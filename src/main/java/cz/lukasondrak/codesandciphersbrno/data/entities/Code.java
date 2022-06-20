package cz.lukasondrak.codesandciphersbrno.data.entities;

import jakarta.persistence.*;

@Entity
public record Code(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id long id,
        String title,
        String description,
        long level,
        @ManyToOne
        @JoinColumn(name = "categoryId")
        Category category,
        String solution) {
}
