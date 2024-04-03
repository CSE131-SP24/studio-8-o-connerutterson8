package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private int size;
	private String[] options = new String[size];
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.size = choices.length;
		this.options = new String[this.size];
		for (int i = 0; i < choices.length; i++) {
			this.options[i] = choices[i];
		}
		
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < this.options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
