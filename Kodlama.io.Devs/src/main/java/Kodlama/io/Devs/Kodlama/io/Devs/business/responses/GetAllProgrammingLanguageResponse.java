package Kodlama.io.Devs.Kodlama.io.Devs.business.responses;

import Kodlama.io.Devs.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllProgrammingLanguageResponse {

	private int id;
	private String name;
}
