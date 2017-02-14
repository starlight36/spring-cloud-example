package com.starlight36.service.showcase.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SequenceResource {

	private final IdGenerator idGenerator;

	@Autowired
	public SequenceResource(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@GetMapping("id")
	public String id(@RequestParam(value = "format", defaultValue = "dec") String format) {
		Long nextId = idGenerator.next();
		if ("hex".equalsIgnoreCase(format)) {
			return String.format("%x", nextId);
		} else {
			return String.format("%d", nextId);
		}
	}
}
