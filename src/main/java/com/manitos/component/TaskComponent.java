package com.manitos.component;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * Nos puede servir para: 
 * Envio Emails Automaticos
 * Eliminar registros de DB, etc.
 */

@Component("taskComponent")
public class TaskComponent {
	
	private static final Log LOG = LogFactory.getLog(TaskComponent.class); 
	
	@Scheduled(fixedDelay= 5000) //Tarea repetitiva de 5seg
	public void doTask(){
		LOG.info("TIME IS: " + new Date());
	}
	
}
