
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

    public String getInfor() {
        return this.name + "-" + this.id + "-" + this.group + "-" + this.email + "\n";
    }

    public static void main(String[] args) {
        Student sv1 = new Student("vu minh nhat" , "20021407", "K65CACLC3","20021407@vnu.edu.vn");
        //System.out.println(sv1.getInfor());

        /*sv1.setName("Vu Minh Nhat");
        System.out.println(sv1.getInfor());
        System.out.println(sv1.getName());

        Student sv2 = new Student(sv1);
        System.out.println(sv2.getInfor());
           */
       // System.out.println(printHello());
        Student sv2 = new Student("tran van duy", "20021319", "K65CACLC2","20021319@vnu.edu.vn");
        Student sv3 = new Student("dao van quyen", "20021422", "K65CACLC2","20021422@vnu.edu.vn");
        Student sv4 = new Student("le anh tuan", "20021234", "K65NCLC1","21231@vnu.edu.vn");

        StudentManagement lophoc = new StudentManagement();
        lophoc.addStudent(sv1);
        lophoc.addStudent(sv2);
        lophoc.addStudent(sv3);
        lophoc.addStudent(sv4);

        //lophoc.studentsByGroup();
        String gr = lophoc.studentsByGroup();
        for(int i = 0; i < gr.length(); i++){
            System.out.print(gr.charAt(i));
        }
        lophoc.removeStudent("20021319");

        String gr1 = lophoc.studentsByGroup();
        for(int i = 0; i < gr1.length(); i++){
            System.out.print(gr1.charAt(i));
        }
        //System.out.println(lophoc.sameGroup(sv1,sv2));
    }



}
