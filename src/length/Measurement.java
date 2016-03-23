package length;

public class Measurement {
    private  double value;
    private  Unit unit;

    public Measurement(double value , Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    private Measurement convertToStandard() {
        double value = this.value * unit.getConversionFactorForBaseUnit();
        return new Measurement(value,unit);
    }

    private Measurement convert(Unit unit) {
        Measurement self = convertToStandard();
        double newValue = (double)Math.round((self.value/unit.getConversionFactorForBaseUnit())*100)/100;
        return  new Measurement(newValue,unit);
    }

    public boolean isEqual ( Measurement measurement) {
        return  equals(measurement);
    }

    public  Measurement add (Measurement measurement) {
        Measurement measurementToAdd = measurement.convertToStandard();
        Measurement self = convertToStandard();
        return new Measurement(self.value + measurementToAdd.value  ,unit.standardUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;
        Measurement measurementForCompare = that.convert(unit);
        return Double.compare(value, measurementForCompare.value) == 0 && unit == measurementForCompare.unit;
    }
}
