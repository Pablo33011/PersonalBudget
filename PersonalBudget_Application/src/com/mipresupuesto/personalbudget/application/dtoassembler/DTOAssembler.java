package com.mipresupuesto.personalbudget.application.dtoassembler;

public interface DTOAssembler <T, D> {
	
	D asembleDTO(T dto);
	T asembleDomain(D domain);

}
