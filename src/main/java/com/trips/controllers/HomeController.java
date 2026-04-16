package com.trips.controllers;


import com.trips.models.Trip; // Para usar tu clase Trip
import java.util.ArrayList;   // Para crear la lista
import java.util.List;        // Para definir el tipo de dato lista
import java.util.Date;        // Para las fechas
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@Controller // Indica que esta clase es un controlador de Spring MVC [cite: 114, 126]
public class HomeController {

    @GetMapping("/") // Mapea la raíz del sitio (localhost:8080/) [cite: 115, 127]
    public String mostrarHome(Model model) {
        // 1. Creamos la lista vacía [cite: 172]
        List<Trip> listaViajes = new ArrayList<>();
        
        // 2. Agregamos varios viajes a la lista [cite: 173]
        // Usamos el constructor: new Trip(nombre, fecha, costo, vigente)
        listaViajes.add(new Trip("Rapel en el Volcan", new Date(), 5.0, true));
        listaViajes.add(new Trip("Surf en el Tunco", new Date(), 15.0, true));
        listaViajes.add(new Trip("Caminata en el Pital", new Date(), 10.0, false));

     // 3. Enviamos la lista completa al modelo bajo el nombre "viajes" [cite: 130]
        model.addAttribute("viajes", listaViajes); 

        return "home"; // Esto busca el archivo home.html en templates
    }
}