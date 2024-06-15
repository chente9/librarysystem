package com.GestionBiblioteca.entidad.lb.servicios;

import com.GestionBiblioteca.entidad.lb.modelos.Libro;
import com.GestionBiblioteca.entidad.lb.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepository;

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        return libroRepository.findByTituloContaining(titulo);
    }

    public Libro agregarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro actualizarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}