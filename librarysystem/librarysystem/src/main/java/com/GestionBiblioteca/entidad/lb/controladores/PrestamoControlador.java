package com.GestionBiblioteca.entidad.lb.controladores;

import com.GestionBiblioteca.entidad.lb.modelos.Prestamo;
import com.GestionBiblioteca.entidad.lb.servicios.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/prestamos")
public class PrestamoControlador {
    @Autowired
    private PrestamoServicio prestamoService;

    @PostMapping
    public Prestamo prestarLibro(@RequestBody Prestamo prestamo) {
        return prestamoService.prestarLibro(prestamo);
    }

    @PutMapping("/{id}/devolver")
    public Optional<Prestamo> devolverLibro(@PathVariable Long id) {
        return prestamoService.devolverLibro(id);
    }
}
