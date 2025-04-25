package com.gestor.tareas.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestor.tareas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByUsername(String username);
}
