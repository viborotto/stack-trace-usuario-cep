package br.com.mastertech.usuariocepservice.mapper;

import br.com.mastertech.usuariocepservice.dto.UsuarioDTO;
import br.com.mastertech.usuariocepservice.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario dtoToEntity(UsuarioDTO dto){
        Usuario entity = new Usuario();

        entity.setNome(dto.getNome());
        entity.setCepUsuario(dto.getCepUsuario());

        return entity;
    }

    public UsuarioDTO entityToDto(Usuario entity){
        UsuarioDTO dto = new UsuarioDTO();

        dto.setNome(entity.getNome());
        dto.setCepUsuario(entity.getCepUsuario());

        return dto;
    }
}
