package com.project.Model;

import com.project.data.Contract;
import com.project.data.ContractLog;

public interface ContractLogDao {
	
	boolean insertContractLog (ContractLog contract);
	Contract selectFinalContract(int contract_id);
	

}
