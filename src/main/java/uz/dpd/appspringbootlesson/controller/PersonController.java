package uz.dpd.appspringbootlesson.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.dpd.appspringbootlesson.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RequestMapping("/api")
@Controller
public class PersonController {
    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "Abror", "Abrorov", "12.12.1998", "+998901234567"),
            new Student(2, "Iskandar", "Iskandarov", "11.12.1999", "+998901234568"),
            new Student(3, "Eldor", "Eldorov", "10.12.1993", "+998901234569"),
            new Student(4, "Bahrom", "Bahromov", "09.12.1995", "+998901234560")
    ));

    @RequestMapping(value = "/student/1", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return students;
    }

//    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
//    private List<Student> getStudentById(Integer id) {
//        for (Student student : students) {
//            if (student.getId().equals(id)) {
//                return students;
//            }
//        }
//        return null;
//}
}
