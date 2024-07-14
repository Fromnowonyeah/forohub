package com.aluracursos.forohub.topicos;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaDeCreacion,
        String status,
        String autor,
        String curso
) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());

    }
}
