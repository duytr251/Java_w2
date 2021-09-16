import java.util.*;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public static boolean sameGroup(Student s1, Student s2){
        return s1.group == s2.group;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String studentsByGroup() {
        ArrayList<String> sBG = new ArrayList<>();
        Set<String> sortGroup = new HashSet<>();
        for(int i = 0; i < students.size(); i++) {
            sortGroup.add(students.get(i).group);
        }
        //Iterator<String> it = sortGroup.iterator();
        for(String element:sortGroup) {
            sBG.add(element.toString());
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).group == element.toString()) {
                    sBG.add(students.get(i).getInfor());
                }
            }
        }
        return sBG.toString();
    }

    public void removeStudent(String id) {
        int pos = 0;
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).id == id) {
                pos = i;
            }
        }
        students.remove(students.get(pos));
    }
    
    public static void main(String[] args) {
        // make object
        Student sv1 = new Student("vu minh nhat" , "20021407", "K65CACLC3","20021407@vnu.edu.vn");
        Student sv2 = new Student("tran van duy", "20021319", "K65CACLC2","20021319@vnu.edu.vn");
        Student sv3 = new Student("dao van quyen", "20021422", "K65CACLC2","20021422@vnu.edu.vn");
        Student sv4 = new Student("le anh tuan", "20021234", "K65NCLC1","21231@vnu.edu.vn");

        //System.out.println(sv1.getInfor());
        sv1.setName("Vu Minh Nhat"); // set name
        System.out.println(sv1.getInfor()); // get information of obj
        System.out.println(sv1.getName()); // get name of obj

        Student sv5 = new Student(sv1);
        System.out.println(sv5.getInfor());


        // make a array object
        StudentManagement lophoc = new StudentManagement();
        // add student
        lophoc.addStudent(sv1);
        lophoc.addStudent(sv2);
        lophoc.addStudent(sv3);
        lophoc.addStudent(sv4);

        //lophoc.studentsByGroup();
        // print the list of student
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
