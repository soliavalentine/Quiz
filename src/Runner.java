import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        String q1 = "Who won best actor in the 2019 Oscars?\n" +
                "(a)Rami Malek\n(b)Mahershala Ali\n(c)Spike Lee\n(d)Mahershala Ali\n";
        String q2 = "Which of the following is not a country?\n"
                + "(a)Vatican City\n(b)Monaco\n(c)Marrakesh\n(d)Eswatini\n";
        String q3 = "Mount Everest is found in which mountain range?\n" +
                "(a)The Himalayas\n(b)The Sierras\n(c)The Alps\n(d)The Rockies\n";
        String q4 = "Which planet is closest to Earth?\n" +
                "(a)Mercury\n(b)Venus\n(c)Mars\n(d)Jupiter\n";
        String q5 = "Which of these is not one of the 10 Commandments?\n" +
                "(a)You shall not make idols\n(b)You shall not bear false witness against your neighbor\n" +
                "(c)You shall not covet\n(d)You shall not eat fish\n";
        String q6 = "What is the tallest mammal?\n" +
                "(a)Elephant\n(b)Giraffe\n(c)Whale\n(d)Rachel\n";
        String q7 = "What zodiac sign is represented by the ram?\n" +
                "(a)Taurus\n(b)Pisces\n(c)Virgo\n(d)Aries\n";
        String q8 = "How many strings does a violin have?\n" +
                "(a)3\n(b)4\n(c)5\n(d)6\n";
        String q9 = "What color is the circle on the Japanese national flag?\n" +
                "(a)red\n(b)orange\n(c)yellow\n(d)pink\n";
        String q10 = "What is the chemical symbol for potassium?\n" +
                "(a)P\n(b)Pt\n(c)Ko\n(d)K\n";

        Quiz[] questions = {
                new Quiz(q1, "a"),
                new Quiz(q2, "c"),
                new Quiz(q3, "a"),
                new Quiz(q4, "b"),
                new Quiz(q5, "d"),
                new Quiz(q6, "b"),
                new Quiz(q7, "d"),
                new Quiz(q8, "b"),
                new Quiz(q9, "a"),
                new Quiz(q10, "d"),
        };
        takeIt(questions);
    }
    public static void takeIt(Quiz[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].Que);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].ans)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
        if(score<=5){
            System.out.println("Congrats! You suck!");
        }else{
            System.out.println("Congrats! You did great!!");
        }
    }
}