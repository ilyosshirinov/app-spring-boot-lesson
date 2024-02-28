package uz.dpd.appspringbootlesson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String  birthDate;
    private String phoneNumber;

    public Student(int i, String iskandar, String iskandarov, String s, String s1) {

    }
}
