package com.rick.springboot_data_jpa.repository;

import com.rick.springboot_data_jpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNameContainingIgnoreCase(String name);

    Usuario findByNameContaining(String username);

    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:name%")
    List<Usuario> filtrarPorNome(@Param("name") String name);
}
