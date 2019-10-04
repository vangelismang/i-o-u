package org.acme.rest.json.service;

import org.acme.rest.json.model.Team;
import org.springframework.stereotype.Service;

@Service
public class TeamService extends CrudService<Team> {

  @Override
  public Team findById(Long id) {

    return Team.findById(id);
  }
}
