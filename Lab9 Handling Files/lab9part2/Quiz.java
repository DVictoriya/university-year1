import java.util.ArrayList;

public class Quiz {
    private ArrayList<FlashCard> quiz;
    String enterAnswer;
    Toolbox myToolbox = new Toolbox();

    public Quiz(String fileName){
        FlashCardReader card  = new FlashCardReader(fileName);// we specify the file where the question and answers are placed
        quiz= card.getFlashCards();//adding the questions and answers to an ArrayList
        play();
    }
    /*
     Taking User input and checking whether the answer provided is correct or wrong, and printing to the terminal
     */
    public void play(){
        for(FlashCard flashCard : quiz) {
            System.out.println(flashCard.getQuestion());

            System.out.println("Please enter your answer");
            enterAnswer = myToolbox.readStringFromCmd();
            if (enterAnswer.equals(flashCard.getAnswer())) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
                System.out.println(flashCard.getAnswer());

            }
        }

    }

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("Questions.txt");
    }
}
