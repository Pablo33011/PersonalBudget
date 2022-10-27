package com.mipresupuesto.personalbudget.application.commmand;

import com.mipresupuesto.personalbudget.dto.BudgetDTO;

public interface CreateBudgetPort {

	void execute(BudgetDTO budget);
}
