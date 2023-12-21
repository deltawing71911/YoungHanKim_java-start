package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = {90, 70, 80, 60, 50, 40, 30, 20,10};
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }
    }

}
