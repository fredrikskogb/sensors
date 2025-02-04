package com.example.sensors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SensorsApplication {
	/**
	 * On startup:<br>
	 *  - Init the central units that are saved in the db.<br>
	 *  - The central unit polls the physical sensors every n seconds and updates the state of the
	 * 	building in the database.<br>
	 *  - The central unit also fetches expectedValue on Sensor from db every x seconds to
	 * see if there are changes to adjust the heat flow.<br><br>
	 * After the initialization, we are able to use the regular rest pattern to fetch/update data
	 * for the client.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SensorsApplication.class, args);
	}
}
