package org.example.SpringFramework.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {
    private final List<PropertyValue> propertyValueList= new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String name) {
        for(PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(name)) {
                return propertyValue;
            }
        }
        return null;
    }
}
