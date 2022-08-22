package com.ulisses.myapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulisses.myapi.domain.Usuario;
import com.ulisses.myapi.repositories.UsuarioRepository;
import com.ulisses.myapi.service.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario FindById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object Not Found! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

	public Usuario create(Usuario usuario) {
		usuario.setId(null);
		return usuarioRepository.save(usuario);
	}

	public Usuario update(Long id, Usuario usuario) {
		Usuario obj = FindById(id);
		obj.setName(usuario.getName());
		obj.setLogin(usuario.getLogin());
		obj.setSenha(usuario.getSenha());
		return usuarioRepository.save(obj);
	}

	public void delete(Long id) {
		usuarioRepository.deleteById(id);
	}

}
