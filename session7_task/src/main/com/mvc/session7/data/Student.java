package main.com.mvc.session7.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOdBirthday;
    private String city;
}
