package com.platziAsael.play.domain.dto;

import com.platziAsael.play.domain.Genre;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record MovieDto(
        Long id,

        @NotBlank(message = "El titulo es obligatorio")
        String title,

        @Positive(message = "La duracion debe ser un numero positivo")
        Integer duration,

        @NotNull(message = "El genero es obligatorio")
        Genre genre,

        @PastOrPresent(message = "La fecha de lanzamiento debe ser anterior a la fecha actual")
        LocalDate releaseDate,

        @Min(value = 0, message = "El rating no puede ser menor que 0")
        @Max(value = 5, message = "El rating no puede ser mayor que 5")
        Double rating,
        boolean state
) {
}
