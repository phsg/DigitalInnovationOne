package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {
	public PersonNotFoundException(final Long pId) {
		super("Não foi encontra a pessoa com ID = " + pId);
	}
}