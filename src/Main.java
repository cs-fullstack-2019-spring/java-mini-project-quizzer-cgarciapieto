import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static HashMap<String, String> Qs = new HashMap<String, String>();

    public static void main(String[] args) {
        File myFile = new File("/home/student/CodeSchool/IdeaProjects/Java/2019-05-22/java-mini-project-quizzer-cgarciapieto/quizzer.txt");

        Scanner myReader = null;

        try {
            myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String txt = myReader.nextLine();
                String[] parts = txt.split(",");
//                Qs.put(parts[0], parts[3]);
            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        Scanner reader = new Scanner(System.in);
        System.out.print("What is the answer");
        String Question = reader.nextLine().trim().toLowerCase();
        String response = Qs.get(Question) != null ? Qs.get(Question) : "Invalid answer";
        System.out.println(response);




    }
}
