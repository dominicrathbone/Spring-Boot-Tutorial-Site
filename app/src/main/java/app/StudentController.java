package app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<String, Student> students = new HashMap<String, Student>();

    public StudentController() {
        students.put("12548760", new Student("Paul", 12548760, "Computer Science", 2));
        students.put("12548761", new Student("Jess", 12548761, "Computer Science Games", 1));
        students.put("12548762", new Student("Helen", 12548762, "Business", 3));
        students.put("12548763", new Student("Chris", 12548763, "Mechanical Engineering", 2));
    }

    @RequestMapping("/student/{studentNumber}")
    public Student getStudentDetails(@PathVariable String studentNumber) {

        if(studentNumber.equals("12548760")) {
          return students.get("12548760");
        }
        if(studentNumber.equals("12548761")) {
            return students.get("12548761");
        }
        if(studentNumber.equals("12548762")) {
            return students.get("12548762");
        }
        if(studentNumber.equals("12548763")) {
            return students.get("12548763");
        }
        return null;
    }

}
