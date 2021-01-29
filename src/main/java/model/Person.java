package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :16:33
 * Day: Thursday
 * Month:January
 * Year:2021
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;

    private Gender gender;
}
