package com.ak.springboot.assignment3.healthchecks;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContibutor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		// TODO Auto-generated method stub
		builder.withDetail("Description", "Added Custom Information in the info endpoint");
	}

}
