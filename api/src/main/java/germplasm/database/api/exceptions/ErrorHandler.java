package germplasm.database.api.exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity error400(MethodArgumentNotValidException exception) {
        var fieldErrorList = exception.getFieldErrors();
        var errorsMessages = fieldErrorList.stream().map(ErrorMessage::new).toList();

        return ResponseEntity.badRequest().body(errorsMessages);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity entityNotFoundError() {
        Map<String, String> message = new HashMap<String, String>();
        message.put("message", "Germoplasma não encontrado");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

    private record ErrorMessage(String message) {
        public ErrorMessage(FieldError error) {
            this(error.getDefaultMessage());
        }
    }
}
