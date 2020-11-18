package com.security.jwt.sql.service;

import com.security.jwt.sql.entity.Usuario;
import com.security.jwt.sql.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreusuario(String nombreUsuario){

        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){

        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){

        return usuarioRepository.existsByemail(email);
    }

    public void save(Usuario usuario){

        usuarioRepository.save(usuario);
    }

    
}
