package com.nttdata.bootcamp.micro1.micro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Clase Micro1
 * 
 * @author jramlope
 *
 */
public class Micro1 {

	@GetMapping(path = "/micro1")
	/**
	 * Método helloMicro1
	 * 
	 * @return
	 */
	public String helloMicro1() {
		return "Micro1";
	}

}
