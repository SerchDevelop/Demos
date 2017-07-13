package com.mx.calendario;

import java.io.Serializable;

public class FechaBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fechaTab;
	private String fechaLong;
	private String fecha;
	
	public FechaBean(){
		
	}

	public String getFechaTab() {
		return fechaTab;
	}

	public void setFechaTab(String fechaTab) {
		this.fechaTab = fechaTab;
	}

	public String getFechaLong() {
		return fechaLong;
	}

	public void setFechaLong(String fechaLong) {
		this.fechaLong = fechaLong;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
