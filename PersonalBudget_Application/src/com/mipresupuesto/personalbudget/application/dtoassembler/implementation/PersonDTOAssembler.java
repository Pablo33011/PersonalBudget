package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.dto.PersonDTO;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

public final class PersonDTOAssembler implements DTOAssembler<PersonDTO, PersonDomain> {

	@Override
	public PersonDTO assembleDTO(PersonDomain dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		if (dto == null) {
			// Throw exception
		}
		return PersonDomain.create(dto.getId(), dto.getIdCard(), dto.getFirstName(), dto.getSecondSurname(),
				dto.getFirstSurname(), dto.getSecondSurname());

	}

}
