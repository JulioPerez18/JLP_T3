package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clases.ClassHabitaciones;
import com.example.clases.ClassReserva;
import com.example.repository.HabitacionesRepository;

@Service
public class HabitacionesServiceImp implements HabitacionesService{

	@Autowired
	private HabitacionesRepository hr;
	@Override
	public List<ClassHabitaciones> ListarHabitaciones() {
		// TODO Auto-generated method stub
		return (List<ClassHabitaciones>)hr.findAll();
	}
	
	@Override
	public ClassReserva guardarReserva(ClassReserva obj) {
		// TODO Auto-generated method stub
		return hr.save(obj);
	}

	@Override
	public ClassReserva obtenerReserva(Integer id) {
		return hr.findById(id).get();
	}

	@Override
	public ClassReserva actualizarReserva(ClassReserva obj) {
		return hr.save(obj);
	}

	@Override
	public void eliminarReserva(Integer id) {
		hr.deleteById(id);
	}

}
