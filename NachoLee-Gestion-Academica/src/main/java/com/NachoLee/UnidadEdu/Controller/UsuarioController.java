package com.NachoLee.UnidadEdu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	@GetMapping(value={"/"})
	public String index() {
		return "index";
	}
	@GetMapping(value={"/userform"})
	public String userform() {
		return "user-form";
	}
}
