package samplearrays;



public class CourseNumbersArray
{
    public static void main(String[] args)
    {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse=3012;
        int[] newRegisteredCourses= new int [registeredCourses.length+1];

        for (int i=0;i<registeredCourses.length;i++){
            newRegisteredCourses[i]=registeredCourses[i];
        }
        newRegisteredCourses[newRegisteredCourses.length-1]=newCourse;
        System.out.println("Course numbers");
        for (int course :newRegisteredCourses){
            System.out.println(course);
        }


        int courseCheck=1010;
        boolean itContains=false;
        for (int course:newRegisteredCourses){
            if (course==courseCheck){
                itContains=true;
                break;
            }
        }
        if (itContains){
            System.out.println("The course is available in the array");
        }
        else {
            System.out.println("The course is not available in the array ");
        }


    }
}
