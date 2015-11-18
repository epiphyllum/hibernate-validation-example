package com.epiphyllum.hv;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by hary on 15/11/14.
 */

@Target( {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)    // javax.validation.Constraint
@Documented
public @interface Password {

    String message() default "{密码必须是5~10位数字和字母组合}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
