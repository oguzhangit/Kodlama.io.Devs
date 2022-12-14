package Kodlama.io.Devs.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguagegRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;


@RestController 
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguageResponse> getAll(){
		
		return this.programmingLanguageService.getAll();
	}
	
	@GetMapping("/getById")
	public GetAllProgrammingLanguageResponse getAll(int id){
		
		return this.programmingLanguageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest lanaguage) throws Exception{
		
		 this.programmingLanguageService.add(lanaguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguagegRequest id){
		
		 this.programmingLanguageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest lanaguage) throws Exception{
		
		 this.programmingLanguageService.update(lanaguage);
	}

}
