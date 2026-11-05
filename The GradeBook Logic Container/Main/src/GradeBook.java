public class GradeBook {
    // 1.Class Variables (State)
    String studentName;
    int assignmentScore;
    int examScore;
    double finalGrade;

    // 2.(Initialization)
    public GradeBook(String name, int aScore, int eScore) {
        this.studentName = name;
        this.assignmentScore = aScore;
        this.examScore = eScore;
    }

    //The Methods (Behavior)
    public void calculateResult() {
        // Explicit casting of integer scores to double before weighted calculation
        finalGrade = ((double) assignmentScore * 0.4) + ((double) examScore * 0.6);
    }

    public void displaySummary() {
        System.out.println("Name: " + studentName + "\n" +
                "Raw Scores: " + assignmentScore + " | " + examScore + "\n" +
                "Final Weighted Grade: " + finalGrade + "%");
    }

    // The main Method (Entry Point)
    public static void main(String[] args) {
        GradeBook alexBook = new GradeBook("Alex", 85, 90);

        // Call the calculation method
        alexBook.calculateResult();

        // Call the display method
        alexBook.displaySummary();
    }
}