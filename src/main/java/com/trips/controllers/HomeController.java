package com.trips.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@Controller // Indica que esta clase es un controlador de Spring MVC [cite: 114, 126]
public class HomeController {

    @GetMapping("/") // Mapea la raíz del sitio (localhost:8080/) [cite: 115, 127]
    public String mostrarHome(Model model) {
        // Definición de variables [cite: 172, 173]
        String trip = "Rapel en el Volcan";
        Date fechaPublicacion = new Date();
        double costo = 5.0;
        boolean vigente = true;

        // Agregando datos al modelo para que la vista los reciba [cite: 160, 162, 173]
        model.addAttribute("trip", trip);
        model.addAttribute("fecha", fechaPublicacion);
        model.addAttribute("costo", costo);
        model.addAttribute("vigente", vigente);

        return "home"; // Busca un archivo llamado home.html en templates [cite: 116, 128]
    }
}