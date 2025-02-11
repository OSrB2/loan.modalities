package com.oliveira.pedro.loan.modalities.service;

import com.oliveira.pedro.loan.modalities.dto.ClientRquestDTO;
import com.oliveira.pedro.loan.modalities.dto.LoanDTO;
import com.oliveira.pedro.loan.modalities.dto.LoanResponseDTO;
import com.oliveira.pedro.loan.modalities.entity.enums.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoanService {

  public LoanResponseDTO determineEligibleLoans(ClientRquestDTO client) {
    List<LoanDTO> eligibleLoans = new ArrayList<>();

    if (client.getIncome() <= 3000) {
      eligibleLoans.add(new LoanDTO(Loan.PERSONAL.name(), Loan.PERSONAL.getInterestRate()));
    }
    if (client.getIncome() > 3000 && client.getIncome() < 5000 && client.getAge() < 30 && client.getLocation().equals("SP")) {
      eligibleLoans.add(new LoanDTO(Loan.PERSONAL.name(), Loan.PERSONAL.getInterestRate()));
    }
    if (client.getIncome() >= 5000) {
      eligibleLoans.add(new LoanDTO(Loan.CONSIGNMENT.name(), Loan.CONSIGNMENT.getInterestRate()));
    }
    if (client.getIncome() <= 3000) {
      eligibleLoans.add(new LoanDTO(Loan.GUARANTEED.name(), Loan.GUARANTEED.getInterestRate()));
    }
    if (client.getIncome() > 3000 && client.getIncome() < 5000 && client.getAge() < 30 && client.getLocation().equals("SP")) {
      eligibleLoans.add(new LoanDTO(Loan.GUARANTEED.name(), Loan.GUARANTEED.getInterestRate()));
    }

    return new LoanResponseDTO(client.getName(), eligibleLoans);
  }
}
