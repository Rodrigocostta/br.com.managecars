package br.com.manage_cars.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageController {



		@RequestMapping( value = "/teste/{bora}", method =  RequestMethod.GET)
		@ResponseStatus(HttpStatus.OK)
		public String testa(@PathVariable String bora ) {
			return bora+ "agora deu!!!   Deus te abençoou e está contigo.";
		}

}
