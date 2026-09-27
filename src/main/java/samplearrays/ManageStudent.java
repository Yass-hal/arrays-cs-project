package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest=students[0];
        for (Student s:students){
            if (s.getAge()>oldest.getAge()){
                oldest=s;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int numberOfAdults=0;
        for(Student s:students){
            if (s.isAdult()){
                numberOfAdults++;
            }
        }
        return numberOfAdults;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sumOfGrades=0;
        for (Student s:students){
            sumOfGrades+=s.getGrade();
        }
        return (double)sumOfGrades/students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s:students){
            if (s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students,(s1,s2)->s2.getGrade()-s1.getGrade());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student s:students){
            if (s.getGrade()>=15){
                System.out.println(s.getName());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (Student s:students){
            if (s.getId()==id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (int i=0;i<students.length-1;i++){
            String nameCheck=students[i].getName();
            for (int j=i+1;j<students.length;j++){
                if (students[j].getName().equals(nameCheck)){
                    System.out.println("Duplicates found");
                    return true;

                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student [] newStudents=new Student[students.length+1];
        for (int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=newStudent;
        return newStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student [] arr=new Student[5];
        arr[0]=new Student(1,"Yasser",19,16);
        arr[1]=new Student(2,"Sarah",19,19);
        arr[2]=new Student(3,"Mohammed",19,18);
        arr[3]=new Student(4,"Mehdi",19,20);
        arr[4]=new Student(5,"Amine",20,20);
        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest



        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

        // 11)
        Student [][] array2d=new Student[2][3];
        array2d[0][0]=arr[0];
        array2d[0][1]=arr[1];
        array2d[0][2]=arr[2];
        array2d[1][0]=arr[3];
        array2d[1][1]=arr[4];
        array2d[1][2]=new Student(6,"kenza",20,17);

        for (int i=0;i<array2d.length;i++){
            System.out.println("Class : "+ (i+1));
            for (int j=0;j<array2d[i].length;j++){
                System.out.println(array2d[i][j].getName());
            }
        }
        for (int i=0;i<array2d.length;i++){
            System.out.println("Top student in class : "+(i+1));
            Student topStudent=array2d[i][0];
            for (int j=0;j<array2d[i].length;j++){
                if (array2d[i][j].getGrade()>topStudent.getGrade()){
                    topStudent=array2d[i][j];
                }
            }
            System.out.println(topStudent.getName());
        }
    }
}

