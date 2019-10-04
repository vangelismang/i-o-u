package org.acme.rest.json.service;

import org.acme.rest.json.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudService<User> {

  @Override
  public User findById(Long id) {

    return User.findById(id);
  }
}
