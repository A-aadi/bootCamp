package length;

public enum LengthUnit implements Unit {
        FEET(12),
        INCH(1),
        CM(0.4),
        MM(0.04);

        private double conversionFactorForInch;

        LengthUnit(double conversionFactorForInch) {
            this.conversionFactorForInch = conversionFactorForInch;
        }
        @Override
        public double getConversionFactorForBaseUnit(){
            return conversionFactorForInch;
        }

    @Override
        public Unit standardUnit() {
            return LengthUnit.INCH;
        }
    }
