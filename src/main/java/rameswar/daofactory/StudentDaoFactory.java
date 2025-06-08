package rameswar.daofactory;

import rameswar.dao.IStudentDao;
import rameswar.dao.StudentDaoImpl;
public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
