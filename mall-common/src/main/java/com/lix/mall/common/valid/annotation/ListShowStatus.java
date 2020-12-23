package com.lix.mall.common.valid.annotation;


import com.lix.mall.common.valid.constraintValidator.ShowStatusConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(
        validatedBy = {ShowStatusConstraintValidator.class}
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ListShowStatus {
    String message() default "请输入指定显示状态";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    int[] listVals() default {};
}
