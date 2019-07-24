package com.example;

import java.util.Random;

public class JokeTelling {

   static private String[] jokes;
     static private Random random;

    public JokeTelling() {
        jokes = new String[9];
        jokes[0] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[1] =
                "Guest to the waiter: “Can you bring me what the lady at the next table is having?” \n" +
                "-\n" +
                "Waiter: “Sorry, sir, but I’m pretty sure she wants to eat it herself.”";


        jokes[2] = "A doctor accidentally prescribes his patient a laxative instead of a coughing syrup.\n" +
                "-\n" +
                "Three days later the patient comes for a check-up and the doctor asks: “Well? Are you still coughing?”\n" +
                "-\n" +
                "The patient replies: “No. I’m afraid to";

        jokes[3] = "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.";
        jokes[4] = "Job interviewer: “And where would you see yourself in five years’ time Mr. Jeffries?\"\n" +
                "-\n" +
                "Mr. Jeffries: \"Personally I believe my biggest weakness is in listening.";
        jokes[5] = "Doctor: You're obese. \n" +
                "-\n" +
                "Patient: For that I definitely want a second opinion. \n" +
                "-\n" +
                "Doctor: You’re quite ugly, too.";
            jokes[6]="\n" +
                    "Husband: Wow, honey, you look really different today. Did you do something to your hair?\n" +
                    "-\n" +
                    "Wife: Michael, I’m over here!";
        jokes[7] = "Mom, where do tampons go?\"\n" +
                "\n" +
                "\"Where the babies come from, darling.\"\n" +
                "\n" +
                "\"In the stork?";
        jokes[8] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public  static String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
