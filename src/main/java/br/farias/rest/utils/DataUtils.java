package br.farias.rest.utils;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class DataUtils {
	
	public static String getDataDiferencaDias(Integer qtdDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
		return getDataFormatada(calendar.getTime());
	}
	
	public static String getDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyy");
		return format.format(data);
	}

}
