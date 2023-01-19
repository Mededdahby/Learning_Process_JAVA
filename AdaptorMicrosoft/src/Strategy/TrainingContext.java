package Strategy;

public class TrainingContext {
    private TrainingProgram trainingProgram;
    
    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public void performTraining() {
        if (trainingProgram != null) {
            trainingProgram.conductTraining();
        } else {
            System.out.println("No training program selected.");
        }
    }
}
