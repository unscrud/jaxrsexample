package dev.unscrud.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.unscrud.model.Pessoa;

public class PessoaRepository {
  private final static Map<Integer, Pessoa> pessoas = new HashMap<>();

  public List<Pessoa> getAll() {
    return new ArrayList<>(pessoas.values());
  }

  public Pessoa get(final int id) {
    return pessoas.get(id);
  }

  public int generateId(final int possible) {
    if (pessoas.containsKey(possible))
      return generateId(possible + 1);
    return possible;

  }

  public void add(final Pessoa pessoa) {
    if (pessoa.getId() == 0)
      pessoa.setId(generateId(pessoas.size() + 1));
    pessoas.put(pessoa.getId(), pessoa);
  }

  public void edit(final Pessoa pessoa) {
    pessoas.remove(pessoa.getId());
    pessoas.put(pessoa.getId(), pessoa);
  }

  public void delete(final int id) {
    pessoas.remove(id);
  }
}
