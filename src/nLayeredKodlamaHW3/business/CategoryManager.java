package nLayeredKodlamaHW3.business;


import nLayeredKodlamaHW3.core.logging.Logger;
import nLayeredKodlamaHW3.dataAccess.ProductDao;
import nLayeredKodlamaHW3.entities.Category;

public class CategoryManager {

private ProductDao productDao;
private Logger loggers [];
private Category[] categories;


public CategoryManager(ProductDao productDao,Logger loggers [],Category[] categories) {
	this.productDao=productDao;
	this.loggers=loggers;
	this.categories=categories;
}
public void add(Category category) throws Exception {
	for (Category gezencategory : categories) {
		if(gezencategory != category) {
		if(gezencategory.getCategoryName()==category.getCategoryName()) {
			throw new Exception("kategori adi ayni olmaz!");
		}
			
	}
	}
	productDao.add(category);
	
	
	for (Logger logger : loggers) {
		logger.log(category.getCategoryName());
	}
}


}
