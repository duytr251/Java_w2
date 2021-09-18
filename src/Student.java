
public class Student {
    private
    String name;
    String id;
    String group;
    String email;

    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
    public Student(String name, String id,String group,String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
    // thiếu phương thức get/set thuộc tính id, group, email
    public String getInfor() {
        return this.name + "-" + this.id + "-" + this.group + "-" + this.email + "\n";
    }

}
