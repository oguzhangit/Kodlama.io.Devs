package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanaguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanaguage, Integer>{


}
