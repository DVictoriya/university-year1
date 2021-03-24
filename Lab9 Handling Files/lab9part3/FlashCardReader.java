import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
    private BufferedReader reader;

    public FlashCardReader(String file) { //creating a new file
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + "File not found.");
        }

    }

    public String getLine() { //reading lines from the file
        String line = null;

        try {
            while ((line = reader.readLine()) != null) {
                return line;
            }

        } catch (IOException e) {
            System.out.println(
                    e.getMessage() + "File not read correctly");
        }
        return line;
    }

    public boolean fileIsReady() { //checking if there are more lines and if the file is ready
        try {
            if (this.reader != null) {
                if (this.reader.ready())
                    return true;
            }
        } catch (IOException ex) {
            System.out.println(
                    ex.getMessage() + "File not ready");
        }
        return false;
    }

    /*
    Creating an Arraylist where the we can read the question and answers
     */
    public ArrayList<FlashCard> getFlashCards() {
        ArrayList<FlashCard> flashCardList = new ArrayList<>();
        String newLine;
        while ((newLine = getLine()) != null) {
            String[] parts = newLine.split(":");
            String question = parts[0];
            String answer = parts[1];
            FlashCard flashCard = new FlashCard(question, answer);
            flashCardList.add(flashCard);
        }
        return flashCardList;

    }

}