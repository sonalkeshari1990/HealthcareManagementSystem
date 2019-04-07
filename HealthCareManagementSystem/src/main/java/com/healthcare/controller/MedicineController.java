package com.healthcare.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.healthcare.service.MedicineService;

@Controller
@RequestMapping("/")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@RequestMapping(value = "/medicineId", method = RequestMethod.GET)
	public ModelAndView getMedicineById(HttpServletRequest request) {
		int medicineId = Integer.parseInt(request.getParameter("medicineId"));
		ModelAndView mv = new ModelAndView();
		mv.addObject("medicineDetails", medicineService.getMedicineById(medicineId));
		return mv;
	}
}
