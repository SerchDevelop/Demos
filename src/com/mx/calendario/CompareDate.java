package com.mx.calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Para declarar valores en nuevos objetos date, usa el mismo formato date que usaste al crear las fechas 
		try {
			Date date1 = sdf.parse("28/02/2017");
			Date date2 = sdf.parse("28/02/2017");
			
			// date1 > date2 == 1
			// date1 = date2 == 0
			// date1 < date2 == -1
			
			Integer resultCompare = date1.compareTo(date2); //date1 < date2, devuelve un valor menor que 0
			System.out.println("resultCompare :: " + resultCompare);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
