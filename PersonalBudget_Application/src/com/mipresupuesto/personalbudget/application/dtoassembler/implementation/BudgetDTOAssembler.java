package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@Component
public final class BudgetDTOAssembler implements DTOAssembler<BudgetDTO, BudgetDomain> {

	private final YearDTOAssembler year = new YearDTOAssembler();
	private final PersonDTOAssembler person = new PersonDTOAssembler();

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		return null;
	}

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {
	if(dto==null) {
		//Throw exception
	}
		return BudgetDomain.create(dto.getId(), year.assembleDomain(dto.getYear()) , person.assembleDomain(dto.getPerson()));
	}

}
