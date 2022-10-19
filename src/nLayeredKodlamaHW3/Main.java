package nLayeredKodlamaHW3;

import nLayeredKodlamaHW3.business.CategoryManager;
import nLayeredKodlamaHW3.business.CourseManager;
import nLayeredKodlamaHW3.core.logging.DataBaseLogger;
import nLayeredKodlamaHW3.core.logging.FileLogger;
import nLayeredKodlamaHW3.core.logging.Logger;
import nLayeredKodlamaHW3.dataAccess.HibernateProductDao;
import nLayeredKodlamaHW3.dataAccess.JdbcProductDao;
import nLayeredKodlamaHW3.dataAccess.ProductDao;
import nLayeredKodlamaHW3.entities.Category;
import nLayeredKodlamaHW3.entities.Course;
import nLayeredKodlamaHW3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Category category1 = new Category(1, "programlama");
		Category category2 = new Category(1, "diger");

		Course course1 = new Course("Java", 50);
		Course course2 = new Course("C", 30);
		Course course3 = new Course("web tasarim", 70);
		Course hatali = new Course("cC", 3);

		Instructor instructor1 = new Instructor("Engin");
		Instructor instructor2 = new Instructor("Demir");

		Category[] categories = { category1, category2 };
		Instructor[] instructors = { instructor1, instructor2 };
		Course[] courses = { course1, course2, course3, hatali };
		Logger[] loggers = { new DataBaseLogger(), new FileLogger() };

		CategoryManager categoryManager = new CategoryManager(new JdbcProductDao(), loggers, categories);
		categoryManager.add(category1);
		categoryManager.add(category2);


		CourseManager courseManager = new CourseManager(new HibernateProductDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

	}

}
