package com.github.gradletpl.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("")
class RestController {

	@RequestMapping("/person")
	public @ResponseBody Person person() {
		return new Person("mark", 20);
	}

}
