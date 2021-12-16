package my.demo.playground.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/** This is an example of Resource Controller Class. */
@Slf4j
@RestController
public class MyController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@PostMapping("/greeting")
	public MyResponse postGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info("Greeting retuned for {}", name);

		// Build the response as a new instance of MyResponse class.
		return new MyResponse(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/greeting")
	public MyResponse getGreeting() {
		long value = counter.incrementAndGet();
		log.info("Return greeting counter = {}", value);

		// Build the response as a new instance of MyResponse class.
		return new MyResponse(value, null);
	}
}