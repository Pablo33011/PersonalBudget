package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity, BudgetDomain>{

	private final YearEntityAssembler year = new YearEntityAssembler();
	private final PersonEntityAssembler person = new PersonEntityAssembler();
	@Override
	public BudgetDomain assembleDomain(BudgetEntity entity) {
		
		return null;
	}

	@Override
	public BudgetEntity assembleEntity(BudgetDomain domain) {
		if(domain==null) {
			//Throw exception
		}
			return BudgetEntity.create(domain.getId(), year.assembleEntity(domain.getYear()) , person.assembleEntity(domain.getPeson()));
		}
		
	}


