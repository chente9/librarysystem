package com.GestionBiblioteca.entidad.lb.repositorios;

import com.GestionBiblioteca.entidad.lb.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContaining(String titulo);
}