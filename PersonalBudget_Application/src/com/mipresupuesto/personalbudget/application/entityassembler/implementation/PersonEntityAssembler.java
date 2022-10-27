package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

@Component
public class PersonEntityAssembler implements EntityAssembler<PersonEntity, PersonDomain>{
private UUID a= UUID.fromString("00000000-0000-0000-0000-000000000000");
	@Override
	public PersonDomain assembleDomain(PersonEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonEntity assembleEntity(PersonDomain domain) {
		if (domain == null) {
			// Throw exception
		}
		return PersonEntity.create(a, domain.getIdCard(), domain.getFirstName(), domain.getSecondSurname(),
				domain.getFirstSurname(), domain.getSecondSurname());

	}

}
