package hello.core4;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("hello");
        helloLombok.setAge(24);

        System.out.println("helloLombok = " + helloLombok);
        System.out.println("helloLombok.getName() = " + helloLombok.getName());
    }
}
