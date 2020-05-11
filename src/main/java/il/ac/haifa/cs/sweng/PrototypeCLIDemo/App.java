package il.ac.haifa.cs.sweng.PrototypeCLIDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	private static List<Question> questions;
	
	private static void setupQuestions() {
		questions = new ArrayList<Question>();
		
		Question q1 = new Question("Select the first answer");
		q1.addAnswer("Foo");
		q1.addAnswer("Bar");
		q1.addAnswer("Baz");
		q1.addAnswer("Moo");
		q1.setCorrectAnswer(1);
		
		Question q2 = new Question("Who is the lecturer of our course?");
		q2.addAnswer("Amir Tomer");
		q2.addAnswer("Liel Fridman");
		q2.addAnswer("Malki Grossman");
		q2.addAnswer("Random cats on YouTube");
		q2.setCorrectAnswer(3);
		
		
		Question q3 = new Question("Complete the sentence: OCSF is..");
		q3.addAnswer("A Turing machine implementation in Java");
		q3.addAnswer("A framework for building client-server applications in Java");
		q3.addAnswer("A framework for creating cat memes");
		q3.addAnswer("A framework for messing with people's minds");
		q3.setCorrectAnswer(2);
		
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		
	}
    public static void main( String[] args )
    {
    	setupQuestions();
        Shell shell = new Shell(questions);
        shell.runShell();
    }
}
