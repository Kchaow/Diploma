package letunov.examples;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String name;
    private int age;
    private List<Dog> dog;
}
