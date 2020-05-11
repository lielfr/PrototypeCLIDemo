package il.ac.haifa.cs.sweng.PrototypeCLIDemo;

import java.io.Serializable;

public class Question implements Serializable {
	private static final long serialVersionUID = -3649744010078024866L;
	private static int nextAvailableId = 1;
	private static final int NUM_ANSWERS =4;
	private String description;
	private String[] answers;
	private int correctIndex;
	private int nextAvailable = 0;
	private int id;
	
	public Question(String description) {
		this.description = description;
		this.answers = new String[NUM_ANSWERS];
		this.correctIndex = -1;
		this.id = nextAvailableId++;
	}
	
	public void addAnswer(String answer) {
		if (nextAvailable >= NUM_ANSWERS)
			return;
		
		answers[nextAvailable++] = answer;
	}
	
	public void setCorrectAnswer(int index) {
		if (index >= 1 && index <=NUM_ANSWERS)
			this.correctIndex = index - 1;
	}

	@Override
	public String toString() {
		if (nextAvailable < NUM_ANSWERS || correctIndex == -1)
			return "ERROR: Question object not correct.";
		
		String outputString =
				String.format("Question %d: %s\n1. %s\n2. %s\n3. %s\n4. %s\nCorrect answer: %d.\n\n", 
						id,
						description,
						answers[0],
						answers[1],
						answers[2],
						answers[3],
						(correctIndex + 1)
		);
		
		return outputString;
	}

	public String getDescription() {
		return description;
	}

	public String[] getAnswers() {
		return answers;
	}

	public int getCorrectIndex() {
		return correctIndex;
	}

	public int getNextAvailable() {
		return nextAvailable;
	}

	public int getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void changeAnswerAtIndex(int index, String answer) {
		if (index > 0 && index <= NUM_ANSWERS) {
			answers[index - 1] = answer;
		}
	}
	
	
}
