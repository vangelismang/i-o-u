package org.acme.rest.json.web;

import org.acme.rest.json.model.User;
import org.acme.rest.json.service.CrudService;
import org.acme.rest.json.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController extends CrudController<User> {

  @Autowired
  private UserService service;

  @Override
  CrudService<User> getService() {

    return this.service;
  }
}
