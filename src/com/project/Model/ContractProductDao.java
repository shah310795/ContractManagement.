package com.project.Model;

import java.util.ArrayList;

public interface ContractProductDao {

	boolean insertContractProduct(int contract_id);
		ArrayList<Integer> selectContractProduct(int contract_id);
	//	boolean deleteContractProduct(int contract_id);
		
	
}
