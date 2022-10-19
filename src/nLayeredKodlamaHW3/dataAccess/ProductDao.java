package nLayeredKodlamaHW3.dataAccess;


import nLayeredKodlamaHW3.entities.Category;
import nLayeredKodlamaHW3.entities.Course;
import nLayeredKodlamaHW3.entities.Instructor;

public interface ProductDao {
public void add(Category category);
public void add(Instructor instructor);
public void add(Course course);
}
