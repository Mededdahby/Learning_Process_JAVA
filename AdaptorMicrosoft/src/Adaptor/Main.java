package Adaptor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before adding  feature ****************");
        Systems basicSystem = new Systems();
        basicSystem.performOperation();

        System.out.println("After adding new features  *****************");
        FeatureAdapter enhancedSystem = new FeatureAdapter(new Systems());
         new NewMicrosofFeature().applyFeature();
         new NewConfigurationFeature().applyFeature();
        enhancedSystem.applyFeature();
    }
}