package hello.core4.member;

public class Member {

    private Long id;
    private String name;
    private Grade Grade;

    public Member(Long id, String name, hello.core4.member.Grade grade) {
        this.id = id;
        this.name = name;
        Grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public hello.core4.member.Grade getGrade() {
        return Grade;
    }

    public void setGrade(hello.core4.member.Grade grade) {
        Grade = grade;
    }
}
