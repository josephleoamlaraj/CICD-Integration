package com.cicdintegrate.code;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryService {

	@GetMapping("/firstservice")
	public String firstService() {
		return "First Service called."+(new Date());
	}
	
	@GetMapping("/getitems/{items}")
	public String getItems(@PathVariable String items) {
		return "Item "+items+" Service called."+(new Date());
	}
	
	@GetMapping("/getservice")
	public String getService(@RequestParam("name") String name) {
		return "The Service '"+name+"' called."+(new Date());
	}
}

