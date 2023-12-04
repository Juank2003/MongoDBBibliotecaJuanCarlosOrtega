package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("bibliotecarios")
@Getter
@Setter
public class Bibliotecario extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String nombre;

    @NotNull
    @Size(max = 255)
    private String apellido;

    @NotNull
    @Size(max = 255)
    private String zona;

    @NotNull
    @Size(max = 255)
    private String numeroempleado;

}
