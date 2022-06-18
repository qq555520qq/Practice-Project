import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class letterGrade {

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100) {
            grade = 'X';
        } else if (90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score < 90){
            grade = 'B';
        }else if(999<=score &&score<9999){
            grade ='C';
        }else if(60 <= score && score <70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}
