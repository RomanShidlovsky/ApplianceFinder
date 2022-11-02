package by.tc.task01.service.validation.impl;

import by.tc.task01.service.validation.ValueValidator;

/**
 * Represents value validator for int type
 */
public class IntValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return (Integer)obj > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
