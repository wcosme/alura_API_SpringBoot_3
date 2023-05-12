package med.voll.api.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ErrorHandler {


    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity error404(){

        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity error400(MethodArgumentNotValidException ex){

        var error = ex.getFieldErrors();

        return ResponseEntity.badRequest().body(error.stream().map(DatailErrorValidation::new).toList());
    }

    private record DatailErrorValidation(String campo, String message){

        public DatailErrorValidation(FieldError error){
            this(error.getField(), error.getDefaultMessage());
        }
    }
}
