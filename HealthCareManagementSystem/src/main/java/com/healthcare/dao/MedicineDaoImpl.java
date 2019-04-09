package com.healthcare.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.healthcare.configuration.HibernateUtil;
import com.healthcare.model.Medicine;

@Repository
public class MedicineDaoImpl implements MedicineDao {

	public Medicine getMedicineById(int medicineId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Medicine m = (Medicine) session.get(Medicine.class, medicineId);
		session.getTransaction().commit();
		session.close();
		return m;
	}
}
