package com.project.stubs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/proposals")
public class ProposalResource {
	private ProposalService proposalService = new ProposalService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Proposal getProposal() {
		return proposalService.getProposal();
	}
}
