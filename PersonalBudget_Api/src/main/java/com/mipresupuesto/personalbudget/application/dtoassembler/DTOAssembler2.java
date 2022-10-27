package com.mipresupuesto.personalbudget.application.dtoassembler;

public interface DTOAssembler2<T, D> {

	D assembleDomain(T dto);
	
	T assembleDTO(D domain);
}
