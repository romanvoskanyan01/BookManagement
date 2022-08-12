package model;
import gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String name;
    private String surname;
    private String email;
    private Gender gender;

}
