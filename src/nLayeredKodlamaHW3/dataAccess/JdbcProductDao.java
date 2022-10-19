package nLayeredKodlamaHW3.dataAccess;


import nLayeredKodlamaHW3.entities.Category;
import nLayeredKodlamaHW3.entities.Course;
import nLayeredKodlamaHW3.entities.Instructor;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori türünde veritabanina eklendi ");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile instructor olarak veritabanina eklendi");
		
	}

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile course olarak veritabanina eklendi");
		
	}

}
