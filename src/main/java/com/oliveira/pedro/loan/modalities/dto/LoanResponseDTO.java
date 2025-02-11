package com.oliveira.pedro.loan.modalities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class LoanResponseDTO {
  private String customer;
  private List<LoanDTO> loans;
}


