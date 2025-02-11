package com.oliveira.pedro.loan.modalities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoanDTO {
  private String type;
  private int interestRate;
}
