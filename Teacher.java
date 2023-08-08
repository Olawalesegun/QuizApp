import java.util.ArrayList;
import java.util.List;

public class Teacher{

    /*private List<Question> questions = new ArrayList<>;*/

    Question[] ques = new Question[5];
    public Teacher(){
        ques[0] = new Question(1, "Which of these is not a Programming Language?",
                "Java", "Python",
                "Ruby", "Orange",
                "Orange" );
        ques[1] = new Question(2, "Which of these is not a Primitive Datatype?",
                "Byte", "String",
                "int", "short",
                "String");
        ques[2] = new Question(3, "What other name is Robert C Martins also known as?",
                "Uncle Bob", "Kendrick Lamar",
                "Agbani Darego", "martin Fowler",
                "Uncle Bob");
    }
    /*private Question question;
    public void createQuestion(int questionID,  String quest, String option1, String option2,
                               String option3, String option4 ){
        question.setQuestionID(questionID);
        question.setQuestionAsked(quest);
        question.setQuestionOption1(option1);
        questions.add(questionID, question);
    }*/
    public String getQuestion(int input){
        switch(input){
            case 1 -> System.out.println("Question 1"  + " " + ques[0].getQuestionAsked() +"\n"+
                    "(a) " + ques[0].getQuestionOption1()+ "\n" +
                    "(b) " + ques[0].getQuestionOption2() + "\n" +
                    "(c) " + ques[0].getQuestionOption3() + "\n" +
                    "(d) " + ques[0].getQuestionOption4() + "\n");
            case 2 -> System.out.println("Question 1"  + " " + ques[1].getQuestionAsked() +"\n"+
                    "(a) " + ques[1].getQuestionOption1()+ "\n" +
                    "(b) " + ques[1].getQuestionOption2() + "\n" +
                    "(c) " + ques[1].getQuestionOption3() + "\n" +
                    "(d) " + ques[1].getQuestionOption4() + "\n");
            case 3 -> System.out.println("Question 1"  + " " + ques[2].getQuestionAsked() +"\n"+
                    "(a) " + ques[2].getQuestionOption1()+ "\n" +
                    "(b) " + ques[2].getQuestionOption2() + "\n" +
                    "(c) " + ques[2].getQuestionOption3() + "\n" +
                    "(d) " + ques[2].getQuestionOption4() + "\n");
        }
        /*int counter = 1;
       // for(Question q: ques){
          return "Question " + counter + " " + q.getQuestionAsked() +"\n"+
                    "(a) " + q.getQuestionOption1() + "\n" +
                    "(b) " + q.getQuestionOption2() + "\n" +
                    "(c) " + q.getQuestionOption3() + "\n" +
                    "(d) " + q.getQuestionOption4() + "\n");
            counter++;
      //  }*/
       return null;
    }
    public String getAnswers(int input){
        String rep = null;
        switch(input){
            case 1 -> {
                rep = ques[0].getAnswer();
            }
            case 2 -> {
               rep = ques[1].getAnswer();
            }
            case 3 -> {
               rep = ques[2].getAnswer();
            }
        }
        return rep;
    }
}
