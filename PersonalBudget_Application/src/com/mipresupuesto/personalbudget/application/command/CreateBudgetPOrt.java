package com.mipresupuesto.personalbudget.application.command;

import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public interface CreateBudgetPOrt {
	void execute(BudgetDTO budget);

}
