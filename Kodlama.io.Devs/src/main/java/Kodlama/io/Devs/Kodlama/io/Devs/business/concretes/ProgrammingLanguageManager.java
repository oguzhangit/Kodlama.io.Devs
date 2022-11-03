package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguagegRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		List<ProgrammingLanaguage> languages =   this.programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> responses = new ArrayList<GetAllProgrammingLanguageResponse>();
		
		for (ProgrammingLanaguage programmingLanaguage : languages) {
			GetAllProgrammingLanguageResponse getAllProgrammingLanguageResponse = new GetAllProgrammingLanguageResponse();
			getAllProgrammingLanguageResponse.setId(programmingLanaguage.getId());
			getAllProgrammingLanguageResponse.setName(programmingLanaguage.getName());
			
			responses.add(getAllProgrammingLanguageResponse);
			
		}
		return responses;
	}

	@Override
	public GetAllProgrammingLanguageResponse getById(int id) {
		
		ProgrammingLanaguage lanaguage =  this.programmingLanguageRepository.findById( id).get();
		GetAllProgrammingLanguageResponse response = new GetAllProgrammingLanguageResponse();
		response.setId(lanaguage.getId());
		response.setName(lanaguage.getName());
		
		return response;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest programmingLanaguage) throws Exception {
		
		List<ProgrammingLanaguage> list = this.programmingLanguageRepository.findAll();
		
		if (programmingLanaguage.getName().isEmpty()) {
			throw new Exception("İsim Boş Olamaz");
		}
		
		for (ProgrammingLanaguage language : list){
			
			if (programmingLanaguage.getName().equals(language.getName())) {
				
				throw new Exception();
			}
		
		
	
		}
			ProgrammingLanaguage lanaguage = new ProgrammingLanaguage();
			lanaguage.setName(programmingLanaguage.getName());
			
		this.programmingLanguageRepository.save(lanaguage);
		
		
	}

	@Override
	public void delete(DeleteProgrammingLanguagegRequest request) {
		this.programmingLanguageRepository.deleteById(request.getId());
		
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest programmingLanaguage) throws Exception {
		
List<ProgrammingLanaguage> list = this.programmingLanguageRepository.findAll();
		
		if (programmingLanaguage.getName().isEmpty()) {
			throw new Exception("İsim Boş Olamaz");
		}
	
		for (ProgrammingLanaguage language : list){
			
			if (programmingLanaguage.getName().equals(language.getName())) {
				
				throw new Exception("İsim Aynı Olamaz");
			}
		
	
		}
		ProgrammingLanaguage lanaguage = new ProgrammingLanaguage();
		lanaguage.setId(programmingLanaguage.getId());
		lanaguage.setName(programmingLanaguage.getName());
		
		
		this.programmingLanguageRepository.save(lanaguage);
	}

}
