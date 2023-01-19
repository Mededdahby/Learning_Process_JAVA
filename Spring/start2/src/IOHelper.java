public class IOHelper {
    IOutputGenerator outputGenerator;

    public IOHelper(CsvOutputGenerator csvOutputGenerator) {
    }

    public void generateOutput(){
        outputGenerator.genrateOutpout();
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

}
