package nLayeredKodlamaHW3.business;

import nLayeredKodlamaHW3.core.logging.Logger;
import nLayeredKodlamaHW3.dataAccess.ProductDao;
import nLayeredKodlamaHW3.entities.Category;
import nLayeredKodlamaHW3.entities.Course;

public class CourseManager {
	private ProductDao productDao;
	private Logger [] loggers;
	private Course [] courses;
	public CourseManager(ProductDao productDao,Logger [] loggers, Course [] courses) {
		this.productDao=productDao;
		this.loggers=loggers;
		this.courses=courses;
	}
	
	
	
	public void add(Course course) throws Exception {
		for (Course gezencourse : courses) {
			if(gezencourse != course) {
				if(gezencourse.getCourseName()==course.getCourseName()) {
					throw new Exception("kurs adi ayni olmaz!");
				}
					
			}
			if(gezencourse.getCoursePrice()<0) {
				throw new Exception("Kurs ücreti 0  dan kucuk olamaz");
			}
		}
		productDao.add(course);
	
	
for (Logger logger : loggers) {
	logger.log(course.getCourseName());
}	
	
	}
}
