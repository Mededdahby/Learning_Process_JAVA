package Adaptor;

import Adaptor.Feature;

public class FeatureAdapter implements Feature {
    private final Systems system;
    public FeatureAdapter(Systems system) {
        this.system = system;
    }
    @Override
    public void applyFeature() {
        system.performOperation();
    }
}
