package org.acme.rest.json.web;

import org.acme.rest.json.model.Team;
import org.acme.rest.json.service.CrudService;
import org.acme.rest.json.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teams")
@RestController
public class TeamController extends CrudController<Team> {

  @Autowired
  private TeamService service;

  @Override
  CrudService<Team> getService() {

    return this.service;
  }
}
