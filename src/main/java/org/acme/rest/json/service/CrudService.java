package org.acme.rest.json.service;

import java.util.List;
import javax.transaction.Transactional;
import org.acme.rest.json.model.CrudModel;

public abstract class CrudService<E extends CrudModel> {

  @Transactional
  public E create(E entity) {
    entity.persist();

    return entity;
  }

  @Transactional
  public void delete(Long id) {
    E.findById(id).delete();
  }

  public List<E> findAll() {

    return E.listAll();
  }

  public abstract E findById(Long id);
}
