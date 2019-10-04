package org.acme.rest.json.web;

import java.util.Collection;
import org.acme.rest.json.model.CrudModel;
import org.acme.rest.json.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public abstract class CrudController<E extends CrudModel> {

  @GetMapping
  public ResponseEntity<Collection<E>> findAll() {

    return ResponseEntity.ok(getService().findAll());
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity findById(@PathVariable("id") Long id) {

    return ResponseEntity.ok(getService().findById(id));
  }

  @PostMapping
  public ResponseEntity create(E entity) {

    return ResponseEntity.status(HttpStatus.CREATED).body(getService().create(entity));
  }

  @DeleteMapping(value = "{/id}")
  public ResponseEntity delete(@PathVariable Long id) {
    getService().delete(id);

    return ResponseEntity.ok().build();
  }

  abstract CrudService<E> getService();
}
