package net.itarray.automotion.internal.properties;

import net.itarray.automotion.internal.geometry.Scalar;

public class Maximum implements ScalarCondition {
    private final Scalar limit;

    public Maximum(Scalar limit) {
        this.limit = limit;
    }

    public Maximum(int limit) {
        this(new Scalar(limit));
    }

    public boolean isSatisfiedOn(Scalar value) {
        return limit.isGreaterOrEqualThan(value);
    }

    public String shortName() {
        return "max";
    }

    @Override
    public String toStringWithUnits(String units) {
        return limit.toStringWithUnits(units);
    }
}
