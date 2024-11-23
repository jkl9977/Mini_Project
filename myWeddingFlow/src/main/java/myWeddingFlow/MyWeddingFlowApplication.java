package myWeddingFlow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
@Controller
@SpringBootApplication
public class MyWeddingFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWeddingFlowApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "thymeleaf/index";
	}
	@GetMapping("regist")
	public String regist() {
		return "thymeleaf/regist";
	}
=======

@SpringBootApplication
@Controller
public class MyWeddingFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWeddingFlowApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "thymeleaf/index";
	}
	@GetMapping("regist")
	public String regist() {
		return "thymeleaf/regist";
	}

>>>>>>> branch 'main' of https://github.com/jkl9977/Mini_Project.git
}
