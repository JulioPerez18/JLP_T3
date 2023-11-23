package com.example.clases;

public class ClassReserva {
	private int id;
	private int cliente_id;
	private int habitacion_id;
	private String fecha_inicio;
	private String fecha_fin;
	private double total;
	private String estado;
	public ClassReserva(int id, int cliente_id, int habitacion_id, String fecha_inicio, String fecha_fin, double total,
			String estado) {
		super();
		this.id = id;
		this.cliente_id = cliente_id;
		this.habitacion_id = habitacion_id;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.total = total;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public int getHabitacion_id() {
		return habitacion_id;
	}
	public void setHabitacion_id(int habitacion_id) {
		this.habitacion_id = habitacion_id;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ClassReserva() {
		super();
	}
	
	
}
