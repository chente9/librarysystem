package com.GestionBiblioteca.entidad.lb.servicios;

import com.GestionBiblioteca.entidad.lb.modelos.Prestamo;
import com.GestionBiblioteca.entidad.lb.repositorios.PrestamoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class PrestamoServicio {
    @Autowired
    private PrestamoRepositorio prestamoRepository;

    public Prestamo prestarLibro(Prestamo prestamo) {
        prestamo.setFechaPrestamo(LocalDate.now());
        prestamo.setFechaDevolucion(LocalDate.now().plusWeeks(2));
        return prestamoRepository.save(prestamo);
    }

    public Optional<Prestamo> devolverLibro(Long id) {
        Optional<Prestamo> prestamo = prestamoRepository.findById(id);
        prestamo.ifPresent(p -> p.setFechaDevolucion(LocalDate.now()));
        return prestamo;
    }
}
