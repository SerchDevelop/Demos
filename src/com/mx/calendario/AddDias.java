package com.mx.calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AddDias {

	public static void main(String[] args) {

		AddDias addDias = new AddDias();
		String date = "20170101";
		String dateFomat = date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6,8); 
		Date actual = new Date(dateFomat);
		System.out.println("actual :: " + actual);
		Integer diasAdd = 0;
		System.out.println("Fecha format :: " + addDias.sumarRestarMesesFecha(date, 0));
		while(diasAdd <= 0){
//			Calendar fecha = addDias.sumarRestarDiasFecha(actual, diasAdd);
			//System.out.println("fecha :: " + fecha + " :: Dia :: " + fecha.DAY_OF_MONTH + " :: Mes :: " + fecha.MONTH +" :: Anio :: " + fecha.YEAR);
//			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
//			System.out.println("Fecha format :: " + sdf.format(fecha.getTime()));
			System.out.println("Fecha format :: " + addDias.sumarRestarDiasFecha(date, diasAdd));
			diasAdd++;
		}
	}
	
	// Suma los días recibidos a la fecha  
	 public String sumarRestarDiasFecha(String dateString, int dias){
		 
//		  String dateFomat = dateString.substring(0,4) + "/" + dateString.substring(4,6) + "/" + dateString.substring(6,8);
		 String dateFomat = dateString.substring(0,4) + "/" + dateString.substring(4,6) + "/" + "01";
		  Date fecha = new Date(dateFomat); 
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); // Configuramos la fecha que se recibe
	      calendar.add(Calendar.MONTH, dias);  // numero de días a añadir, o restar en caso de días < 0
//	      System.out.println("DAY :: " + calendar.get(Calendar.DAY_OF_WEEK));
	      if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
	    	  calendar.set(Calendar.DAY_OF_MONTH, 2);
	      }else if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
	    	  calendar.set(Calendar.DAY_OF_MONTH, 3);
	      }
	      SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
	      return sdf.format(calendar.getTime());
	      
	 }
	 
	 public static String sumarRestarMesesFecha(String dateString, int meses){
		  String dateFomat = dateString.substring(0,4) + "/" + dateString.substring(4,6) + "/" + dateString.substring(6,8);
		  Date fecha = new Date(dateFomat); 
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); // Configuramos la fecha que se recibe
	      calendar.add(Calendar.MONTH, meses);  // numero de meses a aniadir, o restar en caso de meses < 0
	      if(calendar.get(Calendar.DAY_OF_WEEK) == 1){
	    	  calendar.set(Calendar.DAY_OF_MONTH, 2);
	      }else if(calendar.get(Calendar.DAY_OF_WEEK) == 7){
	    	  calendar.set(Calendar.DAY_OF_MONTH, 3);
	      }

	      SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
	      return sdf.format(calendar.getTime());
	      
	 }


}
