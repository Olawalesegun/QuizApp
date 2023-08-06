public class Teacher{

    private Question question;

    public Teacher(){

    }
    public void createQuestion(int questionID,  String quest, String option1, String option2,
                               String option3, String option4 ){
        question.setQuestionID(questionID);
        question.setQuestionAsked(quest);
        question.setQuestionOption1(option1);
    }
    public String getQuestion(){
       return "Question " + question.getQuestionID() + " " + question.getQuestionAsked() +"\n"+
               "(a) " + question.getQuestionOption1() + "\n" +
               "(b) " + question.getQuestionOption2() + "\n" +
               "(c) " + question.getQuestionOption3() + "\n" +
               "(d) " + question.getQuestionOption4() + "\n" ;
    }
}
