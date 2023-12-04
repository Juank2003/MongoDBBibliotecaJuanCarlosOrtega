package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LibroDTO {

    private Long id;

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
