package br.com.myreport;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;

@Endpoint(path = "/reports")
public class Report {
	@Id
	IdRef<Report> id;

	String name;
}
