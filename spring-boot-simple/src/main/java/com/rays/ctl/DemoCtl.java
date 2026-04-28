package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;
import com.rays.dto.TestDTO;

@RestController
@RequestMapping(value = "Demo")
public class DemoCtl {

	@GetMapping("display")
	public ORSResponse display() {

		ORSResponse res = new ORSResponse();
		return res;
	}

	@GetMapping("display1")
	public ORSResponse display1() {

		ORSResponse res = new ORSResponse();

		res.addMesaage("Invalid login or passwor");
		return res;
	}

	@GetMapping("display2")
	public ORSResponse display2() {

		ORSResponse res = new ORSResponse();

		Map<String, String> errors = new HashMap<String, String>();

		errors.put("firstName", "FirstName is required");
		errors.put("LastName", "LastName is required");
		errors.put("Login", "Login is required");
		errors.put("Password", "Password is required");

		res.addInputError(errors);

		return res;
	}

	@GetMapping("display3")
	public ORSResponse display3() {

		ORSResponse res = new ORSResponse();

		List list = new ArrayList<>();

		TestDTO dto = new TestDTO();

		dto.setFirstName("Mehreen");
		dto.setLastName("Ansari");
		dto.setLogin("meh@gmail.com");
		dto.setPassword("12345");

		list.add(dto);

		TestDTO dto1 = new TestDTO();

		dto1.setFirstName("Mehreen");
		dto1.setLastName("Ansari");
		dto1.setLogin("meh@gmail.com");
		dto1.setPassword("12345");

		list.add(dto1);

		res.addData(list);

		return res;
	}
	
	@GetMapping("display4")
	public ORSResponse display4() {
		ORSResponse res = new ORSResponse();

		List roleList = new ArrayList();

		roleList.add("admin");
		roleList.add("student");
		roleList.add("college");
		roleList.add("faculty");
		roleList.add("kiosk");

		res.addResult("roleList", roleList);

		return res;
	}

	@GetMapping("test")
	public ORSResponse testORSResponse() {

		ORSResponse res = new ORSResponse();

		TestDTO dto = new TestDTO();

		List list = new ArrayList();

		dto.setId(1l);
		dto.setFirstName("Mehreen");
		dto.setLastName("Ansari");
		dto.setLogin("meh@gmail.com");
		dto.setPassword("1234");
		dto.setDob("12:12:2003");

//		res.addData(dto);

		res.addMesaage("User added successfully");

		res.addInputError(dto);

		res.addData(list);

		return res;

	}

}
