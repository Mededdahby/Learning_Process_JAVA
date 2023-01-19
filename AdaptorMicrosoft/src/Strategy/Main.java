package Strategy;

public class Main {
    public static void main(String[] args) {

        TrainingContext trainingContext = new TrainingContext();

        trainingContext.setTrainingProgram(new MicrosoftTraining());
        trainingContext.performTraining();


        System.out.println("Change the context [training type] ...");
        trainingContext.setTrainingProgram(new OtherTraining());
        trainingContext.performTraining();
    }
}
