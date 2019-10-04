package org.acme.rest.json.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Cacheable
@Getter
@Setter
public class User extends CrudModel {

  private String firstName;

  private String lastName;

}
