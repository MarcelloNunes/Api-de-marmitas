package projetoMarmita.com.br.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import projetoMarmita.com.br.dtos.MarmitaGetResponseDto;
import projetoMarmita.com.br.entities.Marmita;
import projetoMarmita.com.br.repositories.MarmitariaRepository;

@Controller
public class marmitariaController {

	@Autowired
	private MarmitariaRepository marmitariaRepository;

	@GetMapping("/listar")
	public ResponseEntity<List<MarmitaGetResponseDto>> listarClientes() {

		try {
			List<MarmitaGetResponseDto> lista = new ArrayList<MarmitaGetResponseDto>();

			for (Marmita marmita : marmitariaRepository.findAll()) {
				lista.add(parse(marmita));

			}
			return ResponseEntity.status(200).body(lista);

		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}

	}

	private MarmitaGetResponseDto parse(Marmita marmita) {

		MarmitaGetResponseDto response = new MarmitaGetResponseDto();
		response.setNome(marmita.getNome());
		
		
		

		return response;

	}
}
