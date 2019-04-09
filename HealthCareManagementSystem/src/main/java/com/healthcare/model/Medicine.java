package com.healthcare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medicineId")
	private int medicineId;
	
	@Column(name = "medicineName")
	private String medicineName;
	
	@Column(name = "composition")
	private String composition;

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public Medicine(int medicineId, String medicineName, String composition) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.composition = composition;
	}

	public Medicine() {
		super();
	}
}
