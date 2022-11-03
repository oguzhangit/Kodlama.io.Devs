package Kodlama.io.Devs.Kodlama.io.Devs.business.responses.technologies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetTechnologiesResponse {

	private int id;
	private String name;
	private int programmingLanguageId;
}
