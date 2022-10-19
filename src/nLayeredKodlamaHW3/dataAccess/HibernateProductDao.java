package nLayeredKodlamaHW3.dataAccess;


import nLayeredKodlamaHW3.entities.Category;
import nLayeredKodlamaHW3.entities.Course;
import nLayeredKodlamaHW3.entities.Instructor;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori olarak veritabanina eklendi");		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile instructor olarak veritabanina eklendi");		
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile course olarak veritabanina eklendi");		
		
	}

}
