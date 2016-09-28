package com.citygames.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Game {

  private @Id @GeneratedValue Long id;

  private String name;

  private String description;

  private Date dataStart;

  private Date dataFinish;

  @OneToMany
  private Set<Team> teams;

  @OneToMany
  private Set<GameAdmin> gameAdmins;

}