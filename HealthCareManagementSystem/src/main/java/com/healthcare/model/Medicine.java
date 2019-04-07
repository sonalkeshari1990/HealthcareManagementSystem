package com.healthcare.model;

public class Medicine {
	private int medicineId;
	private String medicineName;
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

}
