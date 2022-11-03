package Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Technologies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Technologies {
	
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private int id;
		
		@Column(name = "name")
		private String name;
		
		@ManyToOne()
		@JoinColumn(name = "programmingLanguageId")
		private ProgrammingLanaguage programmingLanaguage;
}
