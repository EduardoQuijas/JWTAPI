package com.example.Crudrapido.controller;

import com.example.Crudrapido.repository.ContactoRepository;
import com.example.Crudrapido.security.JWTAuthorizationFilter;
import lombok.AllArgsConstructor;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("agenda")
@AllArgsConstructor
public class ContactoController {
    private final ContactoRepository contactoRepository;

    @GetMapping
    public <Contacto> void listContacto() {
        return;
    }

}
