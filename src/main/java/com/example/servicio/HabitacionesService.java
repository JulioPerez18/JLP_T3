package com.example.servicio;

import java.util.List;

import com.example.clases.ClassHabitaciones;
import com.example.clases.ClassReserva;

public interface HabitacionesService {
	public List<ClassHabitaciones> ListarHabitaciones();
	public ClassReserva guardarReserva(ClassReserva obj);
	public ClassReserva obtenerReserva(Integer id);
	public ClassReserva actualizarReserva(ClassReserva obj);
	public void eliminarReserva(Integer id);
}
