package io.bootify.mongo_d_b_biblioteca_juan_carlos_ortega.model;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PrestamoDTO {

    private Long id;

    @NotNull
    private LocalDate fechaprestamo;

    @NotNull
    private LocalDate fechadevolucion;

}
