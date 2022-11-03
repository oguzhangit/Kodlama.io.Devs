package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.CreateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.DeleteTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.technologies.UpdateTechnologyRequest;
import Kodlama.io.Devs.Kodlama.io.Devs.business.responses.technologies.GetTechnologiesResponse;





public interface TechnologiesService {

	List<GetTechnologiesResponse> getAll();
	
	GetTechnologiesResponse getById(int id);
	
	void add(CreateTechnologyRequest request) throws Exception;
	
	void delete(DeleteTechnologyRequest request);
	
	void update(UpdateTechnologyRequest request) throws Exception;
}
