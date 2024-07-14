package com.aluracursos.forohub.topicos;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaDeCreacion,
        String status,
        String autor,
        String curso
) {
    @Override
    public Long id() {
        return id;
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public String mensaje() {
        return mensaje;
    }

    @Override
    public String fechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String status() {
        return status;
    }

    @Override
    public String autor() {
        return autor;
    }

    @Override
    public String curso() {
        return curso;
    }
}
