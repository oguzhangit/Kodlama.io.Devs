package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanaguage> getAll();
	
	ProgrammingLanaguage getById(int id);
	
	void add(ProgrammingLanaguage programmingLanaguage);
	
	void delete(int id);
	
	void update(ProgrammingLanaguage programmingLanaguage);
	
}
