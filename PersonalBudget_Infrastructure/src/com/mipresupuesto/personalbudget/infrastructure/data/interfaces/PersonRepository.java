package com.mipresupuesto.personalbudget.infrastructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entity.PersonEntity;

//Si no se coloca PAILA
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID>{

}
