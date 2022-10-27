package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanaguage> getAll();
	
	ProgrammingLanaguage getById(int id);
	
	void add(ProgrammingLanaguage programmingLanaguage) throws Exception;
	
	void delete(int  id);
	
	void update(ProgrammingLanaguage programmingLanaguage) throws Exception;
}
