package in.mindcraft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {

	@RequestMapping("/delete")
	public String delete() {
		System.out.println("Delete");
		return "delete.jsp";
	}
	
	
}
