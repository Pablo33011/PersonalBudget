package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.entity.YearEntity;

public class YearEntityAssembler implements EntityAssembler<YearEntity, YearDomain>{

	@Override
	public YearDomain assembleDomain(YearEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public YearEntity assembleEntity(YearDomain domain) {
		if (domain == null) {
			// Throw exception
		}
		return YearEntity.create(domain.getId(),domain.getYear());
		
	}

}
