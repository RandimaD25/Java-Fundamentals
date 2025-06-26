import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {"What is the capital of India", "Which country won the Miss World in 2025", "How many states has in USA", "What is the capital of Italy", "How many continents are there"};

        String[][] options = {{"1. Mumbai", "2. Delhi", "3. Rajasthan", "4. Tamil Nadu"},
                {"1. Sri Lanka", "2. India", "3. Thailand", "4. USA"},
                {"1. 26", "2. 35", "3. 51", "4. 54"},
                {"1. France", "2. Rome", "3. Soul", "4. Daka"},
                {"1. 5", "2. 6", "3. 7", "4. 8"}};

        int[] answers = {2, 3, 3, 2, 3};

        int guess;
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("QUIZ GAME\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option: options[i]) {
                System.out.println(option);
            }
        System.out.print("Guess the answer: ");
        guess = scanner.nextInt();

        if (guess == answers[i]) {
            System.out.println("CORRECT\n");
            score++;
        } else {
            System.out.println("WRONG\n");
        }
        }

        System.out.println("Your score = " + score + "/" + questions.length);

        scanner.close();
    }
}
