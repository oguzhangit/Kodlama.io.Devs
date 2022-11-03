package Kodlama.io.Devs.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.TechnologiesService;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.CreateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.DeleteTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.UpdateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.technologies.GetTechnologiesResponse;

@RestController 
@RequestMapping("/api/technologies")
public class TechnologiesContoller {

	 private TechnologiesService service;

	 @Autowired
	public TechnologiesContoller(TechnologiesService service) {
		super();
		this.service = service;
	}
		@PostMapping("/add")
		public void add(CreateTechnologyRequest request) throws Exception{
			
			 this.service.add(request);
		}
		
		
		@DeleteMapping("/delete")
		public void delete(DeleteTechnologyRequest request) throws Exception{
			
			 this.service.delete(request);
		}
		
		@PutMapping("/update")
		public void update(UpdateTechnologyRequest request) throws Exception{
			
			 this.service.update(request);
		}
		
		@GetMapping("/getAll")
		public List< GetTechnologiesResponse> getAll() throws Exception{
			
			 return  this.service.getAll();
		}
		
		@GetMapping("/getById")
		public  GetTechnologiesResponse getById(int id) throws Exception{
			
			 return  this.service.getById(id);
		}
		

}
