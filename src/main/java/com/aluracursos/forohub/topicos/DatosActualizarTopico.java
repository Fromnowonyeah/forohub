package com.aluracursos.forohub.topicos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        String fechaDeCreacion,
        String status,
        String autor,
        String curso
) {
}
