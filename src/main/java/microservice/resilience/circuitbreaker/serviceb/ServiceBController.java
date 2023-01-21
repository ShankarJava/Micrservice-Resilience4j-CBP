package microservice.resilience.circuitbreaker.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBController {
	
	@GetMapping
	public String serviceB() {
		System.out.println("Service B");
		return "SERVICE-B IS CALLED FROM SERVICE-A";
	}

}
