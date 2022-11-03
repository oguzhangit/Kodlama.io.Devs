package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Technologies;

public interface TechnologiesRepository extends JpaRepository<Technologies, Integer> {

}
