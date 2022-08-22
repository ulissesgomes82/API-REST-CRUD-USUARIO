package com.ulisses.myapi.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ulisses.myapi.domain.Usuario;
import com.ulisses.myapi.repositories.UsuarioRepository;

@Configuration
public class TesteConfig implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Ulisses Gomes", "ulisses.gomes", "123456");
		Usuario u2 = new Usuario(null, "Pedro Lucas", "pedro.lucas", "123336");
		Usuario u3 = new Usuario(null, "Luan Vitor", "luan.vitor", "654321");
		Usuario u4 = new Usuario(null, "Samuel Santos", "samuel.santos", "330015");
		Usuario u5 = new Usuario(null, "Jose Pereira", "jose.pereira", "000456");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
	}
	
}
