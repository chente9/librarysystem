package com.GestionBiblioteca.entidad.lb.controladores;

import com.GestionBiblioteca.entidad.lb.modelos.Libro;
import com.GestionBiblioteca.entidad.lb.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    @Autowired
    private LibroServicio libroService;

    @GetMapping("/buscar")
    public List<Libro> buscarLibros(@RequestParam String titulo) {
        return libroService.buscarLibrosPorTitulo(titulo);
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.agregarLibro(libro);
    }

    @PutMapping
    public Libro actualizarLibro(@RequestBody Libro libro) {
        return libroService.actualizarLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
    }
}
