package com.sistemas.prestamos.servicios;

import com.sistemas.prestamos.entidades.Usuario;
import com.sistemas.prestamos.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
