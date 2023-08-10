import java.util.Scanner;

public class QuizConsole {

    Teacher teacher = new Teacher();
    Student student = new Student();
    Scanner scanInput = new Scanner(System.in);
    private String studentResponse;
    private int teacherInput;
    private int studentScore;

    public void startQuiz(){
       welcomePagePrompt();
       gameCommencePrompt();
       takeStudentName();
       quizAppTakes();

    }
    public void welcomePagePrompt(){
        System.out.println(
                """
                    =================================================
                                WELCOME TO THE QUIZ APP
                    ================================================  
                    Hi Student, Kindly reply with your name.
                """
        );
    }
    public void gameCommencePrompt(){
        System.out.println("""
                       =========================================
                              THE GAME WILL NOW COMMENCE
                          ==================================
                """
        );
    }
    public void quizAppTakes(){
        for(int i= 1; i<=3; i++){
            teacherTakesTurn();
            studentTakesTurn();
        }
    }
    public void teacherTakesTurn(){
        teacherPrompt();
        teacherInput = takeTeacherInput();
        teacherSetsQuestion(teacherInput);
    }
    public void studentTakesTurn(){
        studentPrompt();
        studentResponse = studentResponseInput();
        validateStudentResponse(studentResponse);
    }
    public void studentPrompt(){
        System.out.println("""
                Hi Student, Kindly enter your response
                """);
    }
    public void validateStudentResponse(String input){
        if(input.equals(teacher.getAnswers(teacherInput))){
            studentScore++;
        }
        else{
            studentScore--;
        }
    }
    public void teacherPrompt(){
        System.out.println("""
                     As the teacher, kindly Press your preferred number
                    from 1 - 3, while starting with 1 for the student to pick. 
                """);
    }
    public void teacherSetsQuestion(int intake){
        teacher.getQuestion(intake);
    }
    public int takeTeacherInput(){
        int teacherInputToStartQuizForStudent = scanInput.nextInt();
        return teacherInputToStartQuizForStudent;
    }
    public void takeStudentName(){
        System.out.println("Hi, Student!! Enter your name");
        String studentNameIntake = studentResponseInput();
        student.setName(studentNameIntake);
    }
    public String getStudentName(){
        return student.getStudentName();
    }
    public String studentResponseInput(){
        String studentResponse = scanInput.nextLine();
        return studentResponse;
    }
   /* public void setQuiz(){
        teacher .getQuestion();
    }
*/

 /*   private Teacher teacherQuestion = new Teacher();
    private Student studentResponse = new Student();*//*
    Scanner scan = new Scanner(System.in);

    Teacher[] teacherQuestions = new Teacher[5];
    Student[] studentResponses = new Student[5];

    public QuizConsole(){
        teacherQuestions[0] = new Teacher
    }

    public void setQuiz(){
        int count = 0;
     *//*   String question = null;
        String option1 = null;
        String option2 = null;
        String option3 = null;
        String option4 = null;*//*

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
                studentResp.getResponse();
                studentResponses
            }

        }
    }
    public void setStudentDetails(){
        System.out.println("What's your name?");
    }*/

}
