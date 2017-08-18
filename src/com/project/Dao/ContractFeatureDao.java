package com.project.Dao;

import java.util.ArrayList;

public interface ContractFeatureDao {
	
	boolean insertContractFeature(int contract_id);
	ArrayList<Integer> selectContractFeature(int contract_id);
	boolean deleteContractFeature(int contract_id);
	
}
