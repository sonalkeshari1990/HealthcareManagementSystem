package com.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.dao.MedicineDao;
import com.healthcare.model.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineDao medicineDao;

	public Medicine getMedicineById(int medicineId) {
		return medicineDao.getMedicineById(medicineId);
	}
}
