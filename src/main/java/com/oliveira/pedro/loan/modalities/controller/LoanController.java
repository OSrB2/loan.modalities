package com.oliveira.pedro.loan.modalities.controller;

import com.oliveira.pedro.loan.modalities.dto.ClientRquestDTO;
import com.oliveira.pedro.loan.modalities.dto.LoanResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oliveira.pedro.loan.modalities.service.LoanService;

@RestController
@RequestMapping("/api/customer-loans")
public class LoanController {
  @Autowired
  LoanService loanService;

  @PostMapping
  public LoanResponseDTO getEligibleLoans(@RequestBody ClientRquestDTO client) {
    return loanService.determineEligibleLoans(client);
  }
}
