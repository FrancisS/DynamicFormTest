package com.test;

import java.util.List;

/**
 * Created by cyrus on 3/15/2017.
 */
public class DynamicFormValue {
    private DynamicFormValueType type;
    private String label;
    private Object value;
    private List<ListOption> values;
    private String id;
    public DynamicFormValueType getType() {
        return type;
    }

    public void setType(DynamicFormValueType type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<ListOption> getValues() {
        return values;
    }

    public void setValues(List<ListOption> values) {
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
