package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;

import entity.BudgetEntity;

@Service
@Transactional
public  class CreateBudgetUseCaseImpl implements CreateBudgetUseCEntityAssembler<E, D>wired
	privateBudgetEntitybler<BudgetEntity, BudgetEntity> entityAssembler;
	
	@Autowired
	private  BudgetRepository budgetRepository;
	
	@Override
	public  void execute( final BudgetDomain budget) {
		budgetRepository.save(entityAssembler.assembleEntity(budget))
	}
	
	

}
