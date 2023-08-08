public class Question {
    private int questionID;
    private String questionAsked;
    private String questionOption1;
    private String questionOption2;
    private String questionOption3;
    private String questionOption4;
    private String answer;

    public Question(int questionID, String questionAsked,
                    String questionOption1, String questionOption2,
                    String questionOption3, String questionOption4,
                    String answer) {
        this.questionID = questionID;
        this.questionAsked = questionAsked;
        this.questionOption1 = questionOption1;
        this.questionOption2 = questionOption2;
        this.questionOption3 = questionOption3;
        this.questionOption4 = questionOption4;
        this.answer = answer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionAsked() {
        return questionAsked;
    }

    public void setQuestionAsked(String questionAsked) {
        this.questionAsked = questionAsked;
    }

    public String getQuestionOption1() {
        return questionOption1;
    }

    public void setQuestionOption1(String questionOption1) {
        this.questionOption1 = questionOption1;
    }

    public String getQuestionOption2() {
        return questionOption2;
    }

    public void setQuestionOption2(String questionOption2) {
        this.questionOption2 = questionOption2;
    }

    public String getQuestionOption3() {
        return questionOption3;
    }

    public void setQuestionOption3(String questionOption3) {
        this.questionOption3 = questionOption3;
    }

    public String getQuestionOption4() {
        return questionOption4;
    }

    public void setQuestionOption4(String questionOption4) {
        this.questionOption4 = questionOption4;
    }
    public String getAnswer() {
        return answer;
    }
}
