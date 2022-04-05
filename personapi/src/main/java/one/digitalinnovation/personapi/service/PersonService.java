package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.mapper.PersonMapper;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

	private final PersonRepository aPersonRepository;

	private final PersonMapper aPersonMapper = PersonMapper.INSTANCE;

	@Autowired

	public PersonService(PersonRepository pPersonRepository) {
		aPersonRepository = pPersonRepository;
	}


	public Person createPerson(PersonDTO pPersonDTO) {
		Person vPerson = aPersonMapper.toModel(pPersonDTO);
		vPerson = aPersonRepository.save(vPerson);
		return vPerson;
	}

	public List<PersonDTO> listAll() {
		List<Person> vListPerson = aPersonRepository.findAll();
		return vListPerson.stream()
				.map(aPersonMapper::toDTO)
				.collect(Collectors.toList());
	}

	public PersonDTO findById(Long pId) throws PersonNotFoundException {
		//Optional<Person> vOptionalPerson = aPersonRepository.findById(pId);
		//if (vOptionalPerson.isEmpty()) {
		//	throw new PersonNotFoundException(pId);
		//}
		//return aPersonMapper.toDTO((vOptionalPerson.get()));
		Person vPerson = verifyIfExists(pId);
		return aPersonMapper.toDTO(vPerson);
	}

	public void deleteById(final Long pId) throws PersonNotFoundException {
		Person vPerson = verifyIfExists(pId);
		aPersonRepository.deleteById(pId);
	}

	private Person verifyIfExists(final Long pId) throws PersonNotFoundException {
		return aPersonRepository.findById(pId).orElseThrow(() -> new PersonNotFoundException(pId));
	}

	public Person updateById(
			Long pId,
			final PersonDTO pPersonDTO
	) throws PersonNotFoundException {
		verifyIfExists(pId);
		Person vPerson = aPersonMapper.toModel(pPersonDTO);
		vPerson = aPersonRepository.save(vPerson);
		return vPerson;
	}
}