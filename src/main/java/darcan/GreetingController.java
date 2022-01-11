package darcan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@GetMapping("/")
	public String greeting(Model model) {
		model.addAttribute("name", "Server");
		return "greeting";
	}

	@GetMapping("/ajax")
	public @ResponseBody String ajax() {
		return "[11,22,33,\"from server!\"]";
	}

	@GetMapping("/ajax2")
	public @ResponseBody String[] ajax2() {
		// you can also use an "object"/"java bean"
		// and the data will be converted to JSON
		String[] list = { "first", "second", "third", "from Server via JSON from data" };
		return list;
	}

}