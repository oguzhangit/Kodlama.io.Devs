package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.TechnologiesService;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.CreateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.DeleteTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.UpdateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.technologies.GetTechnologiesResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.TechnologiesRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Technologies;

@Service
public class TechnologiesManager   implements TechnologiesService{

	private TechnologiesRepository repository;
	private ProgrammingLanguageService service;
	@Autowired
	public TechnologiesManager(TechnologiesRepository repository , ProgrammingLanguageService service) {
		super();
		this.repository = repository;
		this.service = service;
	}
	
	
	@Override
	public List<GetTechnologiesResponse> getAll() {
		// TODO Auto-generated method stub
		List<Technologies> technologies =  this.repository.findAll();
		
		List<GetTechnologiesResponse> responses = new ArrayList<GetTechnologiesResponse>();		
				
		for (Technologies technology : technologies) {
					GetTechnologiesResponse  response = new GetTechnologiesResponse();
					response.setId(technology.getId());
					response.setName(technology.getName());
					response.setProgrammingLanguageId(technology.getProgrammingLanaguage().getId());
					responses.add(response);
				}
		
		return responses;
	}

	

	@Override
	public GetTechnologiesResponse getById(int id) {
		
		Technologies technologies = this.repository.findById(id).get();
		
		GetTechnologiesResponse response  = new GetTechnologiesResponse(technologies.getId() , technologies.getName() , technologies.getProgrammingLanaguage().getId());
		
		return response;
	}

	@Override
	public void add(CreateTechnologyRequest request) throws Exception {
		
		
		GetAllProgrammingLanguageResponse response = this.service.getById(request.getProgramminglanguageId());
		ProgrammingLanaguage language = new ProgrammingLanaguage( );
		language.setId(response.getId());
		language.setName(response.getName());
		
		
		Technologies technology = new Technologies();
		technology.setName(request.getName());
		technology.setProgrammingLanaguage(language);
		
		this.repository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest request) {
		
		this.repository.deleteById(request.getId());
		
	}

	@Override
	public void update(UpdateTechnologyRequest request) throws Exception {
		
		GetAllProgrammingLanguageResponse response = this.service.getById(request.getProgrammingLanguageId());
		ProgrammingLanaguage language = new ProgrammingLanaguage( );
		language.setId(response.getId());
		language.setName(response.getName());
		
		Technologies technology = new Technologies();
		technology.setId(request.getId());
		technology.setName(request.getName());
		technology.setProgrammingLanaguage(language);
		
		this.repository.save(technology);
		
		
		
	}

}
