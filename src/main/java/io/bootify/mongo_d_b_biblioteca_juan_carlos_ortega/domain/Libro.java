package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.domain;

import io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.model.Estado;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("libroes")
@Getter
@Setter
public class Libro extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String titulo;

    @NotNull
    @Size(max = 255)
    private String autor;

    @NotNull
    @Size(max = 255)
    private String isbn;

    @NotNull
    private Estado estado;

}
