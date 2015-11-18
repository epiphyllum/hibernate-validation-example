package com.epiphyllum.hv;

import java.util.Date;

/**
 * Created by hary on 15/11/14.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.validateSimpleEntity();
        t.validateSimpleProperty();
        t.validateExtendedEntity();
    }

    // 原生 - 验证整个实体
    public void validateSimpleEntity() {
        SimpleEntity se = new SimpleEntity();
        se.setDate(new Date());
        se.setEmail("123");
        se.setName("123");
        se.setPassword("123");
        se.setValid(false);
        ValidationResult result = ValidationUtils.validateEntity(se);
        System.out.println("--------------------------");
        System.out.println(result);
        // result.isHasErrors();
    }

    // 原生 - 验证实体属性
    public void validateSimpleProperty() {
        SimpleEntity se = new SimpleEntity();
        ValidationResult result = ValidationUtils.validateProperty(se,"name");
        System.out.println("--------------------------");
        System.out.println(result);
        // result.isHasErrors();
    }

    // 子定义的Annotation!!
    public void validateExtendedEntity() {
        ExtendedEntity ee = new ExtendedEntity();
        ee.setPassword("212");
        ValidationResult result = ValidationUtils.validateEntity(ee);
        System.out.println("--------------------------");
        System.out.println(result);
        // result.isHasErrors();
    }
}
