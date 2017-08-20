package com.project.Model;

import java.util.ArrayList;

public interface ContractFeatureDao {
	
	boolean addContractFeature(int contract_id);
	ArrayList<Integer> selectContractFeature(int contract_id);
	boolean deleteContractFeature(int contract_id);
	
}
