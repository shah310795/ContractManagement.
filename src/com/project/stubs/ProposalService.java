package com.project.stubs;

import java.util.ArrayList;
import java.util.List;

public class ProposalService {
	private Proposal proposal;
	private List<Feature> featureList;
	ProposalService(){
		featureList = new ArrayList<>();
		featureList.add(new Feature("Qualcomm870", "Something", "Processor", "DETAILS ABOUT PRO", "Octacore"));
		featureList.add(new Feature("Kirin902", "SomethingElse", "Processor2", "DETAILS ABOUT PRO2", "Octacore2"));
		proposal = new Proposal("PROPOSAL", "DESCRIPTION", "SELLER DETAILS", "ADDRESS", featureList, 21, 91);
	}
	
	public Proposal getProposal() {
		return proposal;
	}
}
