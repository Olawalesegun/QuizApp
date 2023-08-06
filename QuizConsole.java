import java.util.Scanner;

public class QuizConsole {
    private Teacher teacherQuestion = new Teacher();
    private Student studentResponse = new Student();
    Scanner scan = new Scanner(System.in);

    Teacher[] teacherQuestions = new Teacher[5];
    Student[] studentResponses = new Student[5];


    public void setQuiz(){
        int count = 0;
        String question = null;
        String option1 = null;
        String option2 = null;
        String option3 = null;
        String option4 = null;
        for(Teacher teacherQ: teacherQuestions){
            System.out.println("Kindly Enter the ID");
            int id = count + 1;
            System.out.println("Kindly Enter Question " + id);
            question = scan.nextLine();
            System.out.println("Kindly Enter option 1");
            option1 = scan.nextLine();
            System.out.println("Kindly Enter option 2");
            option2 = scan.nextLine();
            System.out.println("Kindly Enter option 3");
            option3 = scan.nextLine();
            System.out.println("Kindly Enter option 4");
            option4 = scan.nextLine();
            teacherQ.createQuestion(id, question, option1, option2, option3, option4);
            count++;
        };
    }
    public void displayQuiz(){
        int counter = 0;
        for(Teacher teacherQ: teacherQuestions){
            for(Student studentResp: studentResponses){
                teacherQ.getQuestion();
                studentResp.
                studentResponses.get
            }

        }
    }
    public void setStudentDetails(){
        System.out.println("What's your name?");
    }

}
