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
}
