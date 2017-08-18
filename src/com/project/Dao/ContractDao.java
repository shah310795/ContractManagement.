package com.project.Dao;

import com.project.data.Contract;
import com.project.data.ContractLog;

public interface ContractDao {

	boolean insertFinalContract(ContractLog contract);
	Contract selectContract(int contract_id);
}
