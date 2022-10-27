package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.dto.YearDTO;
import com.mipresupuesto.personalbudget.entity.YearEntity;

public final class YearDTOAssembler implements DTOAssembler<YearDTO, YearDomain>{

	@Override
	public YearDTO assembleDTO(YearDomain dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public YearDomain assembleDomain(YearDTO dto) {
		if (dto == null) {
			// Throw exception
		}
		return YearDomain.create(dto.getId(),dto.getYear());
		
	}

}
