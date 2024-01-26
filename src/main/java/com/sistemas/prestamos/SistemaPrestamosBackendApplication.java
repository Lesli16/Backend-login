package com.sistemas.prestamos;

import com.sistemas.prestamos.entidades.Rol;
import com.sistemas.prestamos.entidades.Usuario;
import com.sistemas.prestamos.entidades.UsuarioRol;
import com.sistemas.prestamos.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaPrestamosBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {

		SpringApplication.run(SistemaPrestamosBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

        /*
            Usuario usuario = new Usuario();

            usuario.setNombre("Lesli");
            usuario.setApellido("Llango");
            usuario.setUsername("Lesli");
            usuario.setPassword("12345");
            usuario.setEmail("l16@gmail.com");
            usuario.setTelefono("0987471935");
            usuario.setCedula("0550448195");
            usuario.setPerfil("foto.png");


            Rol rol = new Rol();
            rol.setRolid(1L);
            rol.setRolNombre("ADMIN");

            Set<UsuarioRol> usuarioRoles = new HashSet<>();
            UsuarioRol usuarioRol = new UsuarioRol();
            usuarioRol.setRol(rol);
            usuarioRol.setUsuario(usuario);
            usuarioRoles.add(usuarioRol);

            Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
            System.out.println(usuarioGuardado.getUsername());



        }*/
	}
}
