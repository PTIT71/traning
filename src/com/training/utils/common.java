package com.training.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class common {
	
	public static String getCurrentDateTime()
	{
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
		 Date date = new Date();  
		 return formatter.format(date);  
	}

}
