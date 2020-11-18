package com.security.jwt.sql.repository;

import com.security.jwt.sql.entity.Rol;
import com.security.jwt.sql.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository  extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
