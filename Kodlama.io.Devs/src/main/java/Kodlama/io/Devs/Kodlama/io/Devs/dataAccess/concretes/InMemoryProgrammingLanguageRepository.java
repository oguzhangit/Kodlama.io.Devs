package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	
	private List<ProgrammingLanaguage> list;
	
	
	public InMemoryProgrammingLanguageRepository() {
		list = new ArrayList<>();
		list.add(new ProgrammingLanaguage(1 , "C#"));
		list.add(new ProgrammingLanaguage(2 , "Java"));
		list.add(new ProgrammingLanaguage(3 , "Pyhton#"));
	}

	@Override
	public List<ProgrammingLanaguage> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ProgrammingLanaguage getById(int id) {
		
		for (ProgrammingLanaguage programmingLanaguage : list) {
			
			if (programmingLanaguage.getId() == id) {
				
				return programmingLanaguage;
				
			}
			
		}
		return null;
		
	}

	@Override
	public void add(ProgrammingLanaguage programmingLanaguage) {
		list.add(programmingLanaguage);
		
	}

	@Override
	public void delete(int id) {
		ProgrammingLanaguage programmingLanaguage = this.getById(id);
		
		list.remove(programmingLanaguage);
		
	}

	@Override
	public void update(ProgrammingLanaguage programmingLanaguage) {
	
		ProgrammingLanaguage language = this.getById(programmingLanaguage.getId());
		int index = list.indexOf(language);
		list.set(index, programmingLanaguage);
		
	}

}
