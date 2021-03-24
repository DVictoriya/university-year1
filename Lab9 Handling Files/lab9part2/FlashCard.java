public class FlashCard {
    private String question;
    private String answer;

    public FlashCard(String questions,String answers){
        this.question= questions;
        this.answer= answers;

    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
}
