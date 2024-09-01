
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {

        for (int i = 1; i <= 5; i++) {
            questions[i - 1] = new Question(i, "Question " + i + "?", "opt1 of Que " + i, "opt2 of Que " + i, "opt3 of Que " + i, "opt4 of Que " + i, Integer.toString(i));
        }

    }

    public void displayQuestions() {

        System.out.println("In Display Questions Method");

        for (Question question : this.questions) {
            System.out.println(question.toString());
        }

    }

    public void playQuiz() {

        int i = 0;
        for (Question q : questions) {
            System.out.println("Question No: " + q.getId());
            System.out.println("Question : " + q.getQuestion());
            System.out.println("Option 1 : " + q.getOpt1());
            System.out.println("Option 2 : " + q.getOpt2());
            System.out.println("Option 3 : " + q.getOpt3());
            System.out.println("Option 4 : " + q.getOpt4());
            System.out.print("Please Enter your answer :: ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
            System.out.println("");
        }

        System.out.println("Printing User Answers :: ");
        for (String s : selection) {
            System.out.println(s);
        }

        this.printScores();
    }

    private void printScores() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }

        System.out.println("Your Score is ::: " + score);

    }

}
