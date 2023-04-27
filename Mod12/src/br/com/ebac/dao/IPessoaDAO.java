package br.com.ebac.dao;

import br.com.ebac.domain.Pessoa;


import java.util.Map;
import java.util.Set;

public interface IPessoaDAO {

    public Boolean cadastrar(Pessoa pessoa);
    public Boolean remover(Pessoa pessoa);
    public void consultarM();
    public void consultarF();
    public void verTodos();

}
