package Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorld {

	@GetMapping("/{name}/{surname}")
	public String helloworld(@PathVariable() String name,@PathVariable() String surname ) {
		return "Hello12345"  + name + surname;
	}
	
}
