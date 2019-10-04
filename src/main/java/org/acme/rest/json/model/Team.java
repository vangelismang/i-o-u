package org.acme.rest.json.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Team extends CrudModel {

  @ManyToOne
  @JoinColumn(nullable = false)
  private User memberA;

  @ManyToOne
  @JoinColumn(nullable = false)
  private User memberB;

  private BigDecimal totalContributionA;

  private BigDecimal totalContributionB;

}
