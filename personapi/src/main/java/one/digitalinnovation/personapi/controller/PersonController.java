package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

	private final PersonService aPersonService;

	@Autowired
	public PersonController(PersonService pPersonService) {
		aPersonService = pPersonService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO createPerson(
			@RequestBody PersonDTO pPersonDTO
	) {
		Person vRetorno = aPersonService.createPerson(pPersonDTO);
		return MessageResponseDTO.builder().message("Create de pessoa com ID = " + vRetorno.getId()).build();
	}


	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO updateById(
			@PathVariable Long pId,
			@RequestBody PersonDTO pPersonDTO
	) throws PersonNotFoundException {
		Person vRetorno = aPersonService.updateById(pId, pPersonDTO);
		return MessageResponseDTO.builder().message("Update pessoa com ID = " + vRetorno.getId()).build();
	}

	@GetMapping
	public List<PersonDTO> listAll() {
		List<PersonDTO> vListPerson = aPersonService.listAll();
		return vListPerson;
	}

	@GetMapping("/{id}")
	public PersonDTO findById(
			@PathVariable Long pId
	) throws PersonNotFoundException {
		PersonDTO vPerson = aPersonService.findById(pId);
		return vPerson;
	}


	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(
			@PathVariable Long pId
	) throws PersonNotFoundException {
		aPersonService.deleteById(pId);
	}

}