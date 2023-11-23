package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.clases.ClassHabitaciones;
import com.example.clases.ClassReserva;
import com.example.clases.Clientes;
import com.example.servicio.HabitacionesService;
import org.springframework.ui.Model;

@Controller
public class HabitacionesController {
	@Autowired
	private HabitacionesService serv;
	
	@GetMapping({"/habitaciones"})
	public String listarHabitaciones(Model modelo){
		modelo.addAllAttributes(serv.ListarHabitaciones());
		return "habitaciones";
	}
	@GetMapping({"/reserva"})
	public String ReservarHabitacion(Model modelo){
		ClassReserva obj = new ClassReserva();
		modelo.addAttribute("reserva",obj);
		return "reserva";
	}
	@PostMapping({"/reserva"})
	public String AgregarHabitacion(@ModelAttribute("hanitaciones") ClassReserva re){
		serv.guardarReserva(re);
		return "redirect:/habitaciones";
	}
	@GetMapping("/habitaciones/editar/{id}")
	public String mostrarForm(Model model) {
		model.addAttribute("habitaciones", serv.obtenerReserva(id));
	}
	@PostMapping("habitaciones/{id]")
	public String actualizarReserva(@PathVariable Integer id,@ModelAttribute("habitacion") ClassReserva hab, Model model) {
		ClassReserva r = serv.obtenerReserva(id);
		r.setId(id);
		r.setFecha_inicio(hab.getFecha_inicio());
		r.setFecha_fin(hab.getFecha_fin());
		r.setTotal(hab.getTotal());
		r.setEstado(hab.getEstado());
		return "redirect:/habitaciones";
	}
	@GetMapping("/habitaciones/eliminar/{id}")
	public String eliminarHab(@PathVariable Integer id) {
		serv.eliminarReserva(id);
		return "redirect:/habitaciones";
	}
}
