package com.GestionBiblioteca.entidad.lb.repositorios;

import com.GestionBiblioteca.entidad.lb.modelos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
}