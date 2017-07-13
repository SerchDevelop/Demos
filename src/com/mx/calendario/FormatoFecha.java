package com.mx.calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FormatoFecha {

	public static void main(String[] args) throws ParseException {

		int diasDiff = 5;
		String fechaInicio = "25-02-2016";
		
		int contador = 1;
		List<FechaBean> tabs = new ArrayList<FechaBean>();
		tabs.add(formatDate(fechaInicio));
		String fechaAux = fechaInicio;
		while(contador <= diasDiff){
			fechaAux = fechaDiaSiguiente(fechaAux);
			tabs.add(formatDate(fechaAux));
			contador++;
		}
		
		for (FechaBean string : tabs) {
			System.out.println("FechaLong :: " + string.getFechaLong()
								+ " FechaTab :: " + string.getFechaTab());
		}
		
	}
	
	protected static FechaBean formatDate(String fechaString) throws ParseException{
		FechaBean fechaBean = new FechaBean();
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = formateador.parse(fechaString);
		SimpleDateFormat dateFormatLong = new SimpleDateFormat("EEEE d 'de' MMMM yyyy");
		SimpleDateFormat dateFormatTab = new SimpleDateFormat("EEE d MMM yyyy");
		SimpleDateFormat dateExample = new SimpleDateFormat("YYYYMMdd");
		
//		System.out.println("Fecha Example :: " + dateExample.format(fecha));
		fechaBean.setFecha(fechaString);
		fechaBean.setFechaLong(dateFormatLong.format(fecha).replace(dateFormatLong.format(fecha).charAt(0), dateFormatLong.format(fecha).toUpperCase().charAt(0)));
		fechaBean.setFechaTab(dateFormatTab.format(fecha).replace(dateFormatTab.format(fecha).charAt(0), dateFormatTab.format(fecha).toUpperCase().charAt(0)));
		return fechaBean;
	}
	
	protected static String fechaDiaSiguiente(String fechaActual){
		
		String formatDate[] = fechaActual.split("-");
		Integer dia = Integer.parseInt(formatDate[0]);
		Integer mes = Integer.parseInt(formatDate[1]);
		Integer anio =  Integer.parseInt(formatDate[2]);
		
//		System.out.println("fechaActual :: " + fechaActual + "dia :: " + dia + " :: mes :: " + mes  + " :: anio :: " + anio);
		
/*		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("Es bisiesto");
		else
			System.out.println("NO bisiesto");
*/
		
		if(dia == 28 && mes == 2){
			if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
				dia = dia + 1;
				return dia.toString() + "-" + mes.toString() + "-" + anio.toString();	
			}else{
				dia = 1;
				mes = mes + 1;
				return dia.toString() + "-" + mes.toString() + "-" + anio.toString();				
			}
		}
		
		if(dia == 30){
			dia = dia + 1;
//			System.out.println("== 30");
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
//				System.out.println("IF");
				dia = 1;
				mes = mes + 1;
			}else if (mes == 12){
//				System.out.println("== 12 Else IF");
				mes = 1;
				anio = anio + 1;
			}else{
				dia = dia + 1;
			}
		}else if (dia == 31){
//			System.out.println("== 31");
			if(mes < 12){
				dia = 1;
				mes = mes + 1;
//				System.out.println("< 12");
			}else{
//				System.out.println("== 12 ::");
				mes = 1;
				anio = anio + 1;
			}
		}else{
//			System.out.println("Menor 30");
			dia = dia + 1;
		}
		
//		System.out.println("FECHA :: " + dia.toString() + "-" + mes.toString() + "-" + anio.toString());
		return dia.toString() + "-" + mes.toString() + "-" + anio.toString();
	}


}
