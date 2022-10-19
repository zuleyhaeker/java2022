package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entity.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Egitmen JDBC ile veritabanina eklendi.");
    }

    @Override
    public void delete(int id) {
        instructors.remove(id);
        System.out.println("Egitmen silindi.");
    }

    @Override
    public void update(int id, Instructor instructor) {
        instructors.set(id, instructor);
        System.out.println("Egitmen bilgileri guncellendi.");
    }

    @Override
    public Instructor findById(int id) {

        return instructors.get(id-1);
    }

    @Override
    public List<Instructor> getInstructors() {
        return instructors;
    }
}
