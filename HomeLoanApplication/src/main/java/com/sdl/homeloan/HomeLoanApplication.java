package com.sdl.homeloan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeLoanApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(HomeLoanApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(HomeLoanApplication.class, args);
<<<<<<< HEAD:HomeLoanApplication/src/main/java/com/sdl/HomeLoanApplication.java

                 
                 
                 
			 System.out.println("Application Running By Master");
			 System.out.println("Application is Running By Suprriya");
			 System.out.println("Application again is Running by Priya");
			 System.out.println("Application run by Riya");
                
=======
		LOGGER.info("HomeLoan Application Running........");
>>>>>>> 8145001265375931128a13069a48e3c608db7db7:HomeLoanApplication/src/main/java/com/sdl/homeloan/HomeLoanApplication.java
	}

}
