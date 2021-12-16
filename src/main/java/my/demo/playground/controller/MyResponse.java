package my.demo.playground.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** This is an example of Resource Representation Class for the MyResponse objects. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyResponse {
	private Long id;
	private String text;

}