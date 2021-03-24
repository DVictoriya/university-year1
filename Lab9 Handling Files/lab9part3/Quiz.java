import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz {
    private ArrayList<FlashCard> quiz;
    boolean saveResults;
    int correctAnswersGiven = 0;
    ArrayList<String> savePrint;
    Toolbox myToolbox = new Toolbox();

    public Quiz(String fileName){
        FlashCardReader card  = new FlashCardReader(fileName); // we specify the file where the question and answers are placed
        quiz = card.getFlashCards();//adding the questions and answers to an ArrayList
        play();
    }
    public void play(){
        savePrint = new ArrayList<String>(); //creating a new ArrayList where each line would be printed
        saveResults = saveResults();// when calling the save()
        for(FlashCard flashCard : quiz) { //iterating over the ArrayList which contains the questions and answers
                System.out.println(flashCard.getQuestion());

                System.out.println("Please enter your answer");
                String enterAnswer = myToolbox.readStringFromCmd(); //taking input from user
                if (enterAnswer.equalsIgnoreCase(flashCard.getAnswer())) {
                    System.out.println("Correct");
                    correctAnswersGiven++;
                    savePrint.add(flashCard.getQuestion()+ " " +flashCard.getAnswer()+ ","  +enterAnswer+ " ,right"); //printing the question, answer if the answer is correct

                } else {

                    System.out.println("Wrong");
                    System.out.println("The correct answer is " + flashCard.getAnswer());
                    savePrint.add(flashCard.getQuestion()+ " " +flashCard.getAnswer()+ "," +enterAnswer+  " ,wrong");//printing the question, answer if the answer is false
                }
            if (saveResults)
                save();
            }
        }
        public void save() { // creating a new file, if there exists a new file we override it
            PrintStream output = null;
            try {
                output = new PrintStream(new File("save.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("Could not create output file");
                e.printStackTrace();
            }

            for (String line : savePrint) { //iterating over the file containing questions and answers
                output.println(line);
            }
            output.println(correctAnswersGiven + "," + quiz.size() + "," //printing the number of correct answers
                    + (float) (correctAnswersGiven * 100.0) / quiz.size()); // calculating the correct answers by dividing the number by the size of the arrayList
        }

    public boolean saveResults() { // asking the user if he/she wants to save his/her results
        System.out.println("Would you like to save your results? [y/n]");
        String answer = myToolbox.readStringFromCmd();
        if (answer.equalsIgnoreCase("Y"))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("Questions.txt");
    }
}
