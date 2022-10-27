package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;


import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanaguage> getAll() {
		// TODO Auto-generated method stub
		return this.programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanaguage getById(int id) {
		// TODO Auto-generated method stub
		return this.programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanaguage programmingLanaguage) throws Exception {
		
		List<ProgrammingLanaguage> list = this.getAll();
		
		if (programmingLanaguage.getName().isEmpty()) {
			throw new Exception("İsim Boş Olamaz");
		}
		
		for (ProgrammingLanaguage language : list){
			
			if (programmingLanaguage.getName().equals(language.getName())) {
				
				throw new Exception();
			}
		
	
		}
		
		this.programmingLanguageRepository.add(programmingLanaguage);
		
		
	}

	@Override
	public void delete(int id) {
		this.programmingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanaguage programmingLanaguage) throws Exception {
		
List<ProgrammingLanaguage> list = this.getAll();
		
		if (programmingLanaguage.getName().isEmpty()) {
			throw new Exception("İsim Boş Olamaz");
		}
		for (ProgrammingLanaguage language : list){
			
			if (programmingLanaguage.getName().equals(language.getName())) {
				
				throw new Exception("İsim Aynı Olamaz");
			}
		
	
		}
		
		
		this.programmingLanguageRepository.update(programmingLanaguage);		
	}

}
