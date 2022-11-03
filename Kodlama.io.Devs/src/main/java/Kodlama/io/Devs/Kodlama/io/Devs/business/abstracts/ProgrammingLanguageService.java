package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguagegRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguageResponse> getAll();
	
	GetAllProgrammingLanguageResponse getById(int id);
	
	void add(CreateProgrammingLanguageRequest programmingLanaguage) throws Exception;
	
	void delete(DeleteProgrammingLanguagegRequest request);
	
	void update(UpdateProgrammingLanguageRequest programmingLanaguage) throws Exception;
}
