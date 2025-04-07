package com.rick.springboot_data_jpa.repository;

import com.rick.springboot_data_jpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
