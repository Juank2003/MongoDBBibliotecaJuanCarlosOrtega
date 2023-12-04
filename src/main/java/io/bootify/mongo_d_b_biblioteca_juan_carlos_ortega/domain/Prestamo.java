package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.domain;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("prestamoes")
@Getter
@Setter
public class Prestamo extends Biblioteca {

    @NotNull
    private LocalDate fechaprestamo;

    @NotNull
    private LocalDate fechadevolucion;

}
