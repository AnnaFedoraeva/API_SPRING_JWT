package ApiConJwt.api.controller;

import ApiConJwt.api.model.Contacto;
import ApiConJwt.api.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("contacts")
@AllArgsConstructor
public class ContactoController {

    private ContactoRepository contactoRepository;

    @GetMapping
    public ResponseEntity <List <Contacto>> listContacto() {

        return new ResponseEntity<>(contactoRepository.findAll(), HttpStatus.OK);
    }
}
