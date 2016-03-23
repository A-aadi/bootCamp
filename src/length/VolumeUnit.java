package length;

public enum VolumeUnit implements Unit {
    LITRE (1),
    GALLON(3.78);

    private double conversionFactorForLitre;

    VolumeUnit(double conversionFactorForLitre) {
        this.conversionFactorForLitre = conversionFactorForLitre;
    }


    @Override
    public double getConversionFactorForBaseUnit() {
        return conversionFactorForLitre;
    }

    @Override
    public Unit standardUnit() {
        return VolumeUnit.LITRE;
    }

}
