package br.com.mastertech.usuariocepservice.repository;

import br.com.mastertech.usuariocepservice.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
