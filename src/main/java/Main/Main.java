package Main;

import Dao.StudentDao;
import Model.Student;

public class Main {
    public static void main(String[] args) {

        StudentDao studentDao = new StudentDao();
        Student student = new Student("Rehman","Sultanli","rehman.sultanli@gmail.com");

    }
}
