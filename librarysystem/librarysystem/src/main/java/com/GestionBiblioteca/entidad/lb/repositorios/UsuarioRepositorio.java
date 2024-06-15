package com.GestionBiblioteca.entidad.lb.repositorios;

import com.GestionBiblioteca.entidad.lb.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}