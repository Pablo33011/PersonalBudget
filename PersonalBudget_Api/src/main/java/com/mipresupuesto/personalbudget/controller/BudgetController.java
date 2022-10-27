package com.mipresupuesto.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.commmand.CreateBudgetPort;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {

	@Autowired
	private  CreateBudgetPort createBudgetPort;
	
	@PostMapping
	public boolean create(@RequestBody BudgetDTO budget) {
		createBudgetPort.execute(budget);
		return true;
	}
	
	@GetMapping
	public String saludar() {
		return "Hola Mundo!!!";
	}
	@GetMapping("/dummy")
	public BudgetDTO dummy() {
		return BudgetDTO.CreateBudget();
	}
}
