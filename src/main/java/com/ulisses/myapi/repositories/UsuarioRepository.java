package com.ulisses.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.myapi.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
