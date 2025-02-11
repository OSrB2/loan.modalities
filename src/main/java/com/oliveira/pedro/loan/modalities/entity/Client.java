package com.oliveira.pedro.loan.modalities.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int age;
  private String cpf;
  private double income;
  private String location;
}
