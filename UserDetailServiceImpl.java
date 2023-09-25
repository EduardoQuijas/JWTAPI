package com.example.Crudrapido.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.Crudrapido.model.Usuario;
import com.example.Crudrapido.repository.UsuarioRepository;

import java.util.Map;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Usuario usuario = usuarioRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con email" + email + "no existe."));

       return new USerDetailsImpl(usuario);
    }

}
