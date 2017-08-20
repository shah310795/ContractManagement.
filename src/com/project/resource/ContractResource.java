package com.project.resource;

import javax.ws.rs.Path;

import com.project.data.Contract;

@Path("/contracts")
public class ContractResource {
	public Contract getContract(int id) {
		Contract obj = new Contract();
		return obj;
	}
}
