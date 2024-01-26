package com.sistemas.prestamos.servicios.impl;

import com.sistemas.prestamos.entidades.Usuario;
import com.sistemas.prestamos.entidades.UsuarioRol;
import com.sistemas.prestamos.repositorios.RolRepository;
import com.sistemas.prestamos.repositorios.UsuarioRepository;
import com.sistemas.prestamos.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuariolocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuariolocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        } else {
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuariolocal = usuarioRepository.save(usuario);
        }

        return usuariolocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
}

