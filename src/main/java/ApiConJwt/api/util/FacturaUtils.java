package ApiConJwt.api.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class FacturaUtils {

    private FacturaUtils(){

    }

    public static ResponseEntity <String> getResponseEntity (String message, HttpStatus httpStatus){
        return new ResponseEntity<String>("Mensaje: " + message, httpStatus);
    }
}
