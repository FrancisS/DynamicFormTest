package com.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.test.DynamicFormValueType.SELECTONEMENU;
import static com.test.DynamicFormValueType.TEXT;

/**
 * Created by cyrus on 3/15/2017.
 */
@ManagedBean
@ViewScoped
public class TestBean {
    private Map<String, DynamicFormValue> dynamicFormValueMap;
    @PostConstruct
    public void init() {
        dynamicFormValueMap = new HashMap<>();
        DynamicFormValue dynamicFormValue = new DynamicFormValue();
        dynamicFormValue.setLabel("Test Text Box");
        dynamicFormValue.setType(TEXT);
        dynamicFormValue.setId("id1");
        dynamicFormValueMap.put("key1", dynamicFormValue);
        dynamicFormValue = new DynamicFormValue();
        dynamicFormValue.setLabel("Test Text Box 2");
        dynamicFormValue.setType(TEXT);
        dynamicFormValue.setId("id2");
        dynamicFormValueMap.put("key2", dynamicFormValue);
        dynamicFormValue = new DynamicFormValue();
        dynamicFormValue.setLabel("Test Combo Box");
        dynamicFormValue.setType(SELECTONEMENU);
        dynamicFormValue.setId("id3");
        dynamicFormValue.setValues(new ArrayList<>());
        dynamicFormValue.getValues().add(new ListOption("Test Option One", 1));
        dynamicFormValue.getValues().add(new ListOption("Test Option Two", 2));
        dynamicFormValue.getValues().add(new ListOption("Test Option Three", 3));
        dynamicFormValueMap.put("key3", dynamicFormValue);

    }
    public void testAction() {
        for (DynamicFormValue dynamicFormValue : dynamicFormValueMap.values()) {
            System.out.println(dynamicFormValue.getValue());
        }
    }
    public Map<String, DynamicFormValue> getDynamicFormValueMap() {
        return dynamicFormValueMap;
    }

    public void setDynamicFormValueMap(Map<String, DynamicFormValue> dynamicFormValueMap) {
        this.dynamicFormValueMap = dynamicFormValueMap;
    }
}
