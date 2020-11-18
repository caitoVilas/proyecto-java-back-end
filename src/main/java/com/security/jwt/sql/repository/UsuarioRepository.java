package com.security.jwt.sql.repository;

import com.security.jwt.sql.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombreUsuario(String nommbreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByemail(String email);
}
