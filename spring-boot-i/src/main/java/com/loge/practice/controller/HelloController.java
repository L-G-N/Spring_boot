/**
 * 
 */
package com.loge.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LGN
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "from hello controller";
	}
}
