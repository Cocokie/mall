package com.lix.mall.common.valid.constraintValidator;

import com.lix.mall.common.valid.annotation.ListShowStatus;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ShowStatusConstraintValidator implements ConstraintValidator<ListShowStatus,Integer> {
    private Set s = new HashSet<>();
    @Override
    public void initialize(ListShowStatus constraintAnnotation) {
        int[] ints = constraintAnnotation.listVals();
        for (int anInt : ints) {
            s.add(anInt);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        return s.contains(integer);
    }
}
