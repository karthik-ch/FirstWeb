package com.nisum.firstWeb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.nisum.firstWeb.bean.Result;

@RestController
@EnableWebMvc
@RequestMapping("/tempConvert")
public class ConverterController {

	@RequestMapping(value = "/ctof/{number}", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public Result converCtoF(@PathVariable String number) {
		Result result = new Result();
		result.setValue((Double.parseDouble(number) * 9) / 5 + 32);
		result.setUnit("Fareignhiet");
		return result;
	}

	@RequestMapping(value = "/ftoc/{number}", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public Result converFtoC(@PathVariable String number) {
		Result result = new Result();
		result.setValue(((Double.parseDouble(number) - 32) * 5) / 9);
		result.setUnit("Centigrade");
		return result;
	}

}
