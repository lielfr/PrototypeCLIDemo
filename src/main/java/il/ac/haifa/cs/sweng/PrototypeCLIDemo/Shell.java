package il.ac.haifa.cs.sweng.PrototypeCLIDemo;

import java.util.List;
import java.util.Scanner;

public class Shell {
	private List<Question> questions;

	public Shell(List<Question> questions) {
		this.questions = questions;
	}

	private void parseCommand(String command) {
		
		
		String splittedCommand[] = command.split("\\s", 4);

		if (command.length() == 0 || command.equals("\n") || command.equals("\r"))
			return;

		if (splittedCommand[0].equals("?")) {
			// TODO: Add usage here.
		} else if (splittedCommand[0].equals("#list")) {
			for (Question question : questions) {
				System.out.println(question.toString());
			}
		} else if (splittedCommand[0].equals("#set")) {
			if (splittedCommand.length != 4) {
				System.err.println("ERROR: #set must have EXACTLY 3 arguments: <id> <description/correctAnswer/answer id> <new content>");
				return;
			}
			int selectedIndex;
			try {
				selectedIndex = Integer.parseInt(splittedCommand[1]);
			} catch (NumberFormatException exception) {
				System.err.println("ERROR: Incorrect id");
				return;
			}
			Question selectedQuestion = questions.get(selectedIndex - 1);
			if (splittedCommand[2].equals("description")) {
				selectedQuestion.setDescription(splittedCommand[3]);
			} else if (splittedCommand[2].equals("correctAnswer")) {
				selectedQuestion.setCorrectAnswer(Integer.parseInt(splittedCommand[3]));
			} else {
				int answerId = Integer.parseInt(splittedCommand[2]);
				selectedQuestion.changeAnswerAtIndex(answerId, splittedCommand[3]);
			}
			System.out.format("Updated question %d:\n%s", selectedIndex, selectedQuestion.toString());
		} else if (splittedCommand[0].equals("#exit")) {
			System.exit(0);
		} else {
			System.err.println("ERROR: Unrecognized command.");
		}
	}
	
	public void runShell() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Shell-> ");
			String inputString = scanner.nextLine();
			parseCommand(inputString);
		}
	}
}
