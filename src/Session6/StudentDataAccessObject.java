package Session6;

import ass8.Students;
import connector.Connector;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDataAccessObject implements DataAccessObjectConcreate<Students> {

    private static StudentDataAccessObject instance;

    private StudentDataAccessObject() {

    }

    public static StudentDataAccessObject getInstance() {
        if (instance == null)
            instance = new StudentDataAccessObject();
        return instance;
    }

    @Override
    public ArrayList<Students> list() {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM students");
            ArrayList<Students> ls = new ArrayList<>();
            while (rs.next()) {
                ls.add(new Students(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("age"), rs.getInt("mark")));
            }
            return ls;
        } catch (Exception e) {
        }

        return null;
    }

    public Students getOne(int id) {
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM students WHERE id = " + id);
            while (rs.next()) {
                return new Students(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("age"), rs.getInt("mark"));
            }
        } catch (Exception e) {
        }

        return null;
    }

    @Override
    public Boolean create(Students students) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "INSERT INTO students(name,age,,mark) " + "VALUES('" +
                    ""+students.getName()+"','"+students.getAge()+"','"+students.getMark()+"')";
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Boolean update(Students students) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "UPDATE students SET name = "+students.getName()+
                    "age ="+students.getAge() +
                    "mark = " + students.getMark()+
                    "WHERE id = "+students.getId();
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {
        }

        return false;
    }

    @Override
    public Boolean detele(Students students) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "DETELE students WHERE id = "+students.getId();
            return conn.excuteUpdate(sql_text);
        } catch (Exception e) {
        }
        return false;
    }
}