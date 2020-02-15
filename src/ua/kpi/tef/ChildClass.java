package ua.kpi.tef;

public class ChildClass extends ParentClass {
    public void otherMethod() {
        int intValue;
        intValue = publicValue;
        intValue = protectedValue;
        intValue = defaultValue;
        //intValue = privateValue;
        intValue = getPrivateValue();
    }
}
