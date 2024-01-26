package com.sistemas.prestamos.repositorios;

import com.sistemas.prestamos.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}



