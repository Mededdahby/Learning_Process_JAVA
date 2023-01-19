public class IOHelper {
    IOutputGenerator outputGenerator;
    public void generateOutput(){
        outputGenerator.genrateOutpout();
    }
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

}
