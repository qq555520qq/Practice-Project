import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class letterGrade {

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100) {
            grade = 'X';
        }else if(60 <= score && score <70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}
