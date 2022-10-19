package nLayeredKodlamaHW3.business;

import nLayeredKodlamaHW3.core.logging.Logger;
import nLayeredKodlamaHW3.dataAccess.ProductDao;
import nLayeredKodlamaHW3.entities.Instructor;

public class InstructorManager {
private ProductDao productDao;
private Logger [] loggers;
public InstructorManager(ProductDao productDao,Logger [] loggers) {
this.productDao=productDao;
this.loggers=loggers;
}
public void add(Instructor instructor) {
	productDao.add(instructor);
	
	
	for (Logger logger : loggers) {
		logger.log(instructor.getInstructorName());
	}
}

}
