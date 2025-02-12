package com.oliveira.pedro.loan.modalities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientRquestDTO {
  private String name;
  private int age;
  private String cpf;
  private double income;
  private String location;
}
