package com.healthcare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MedicineController {

	@RequestMapping(value = "/medicineId", method = RequestMethod.GET)
	public ModelAndView getMedicineById() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("medicineDetails", "");
		return mv;
	}
}
