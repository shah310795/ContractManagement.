package com.project.Dao;

import java.util.ArrayList;

public interface ContractProductDao {

	boolean insertContractProduct(int contract_id);
		ArrayList<Integer> selectContractProduct(int contract_id);
		boolean deleteContractFeature(int contract_id);
		
	
}
