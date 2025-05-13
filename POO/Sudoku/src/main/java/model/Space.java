package main.java.model;

public class Space {
    private final boolean isFixed;
    private Integer actual;
    private final int expected;

    public Space(final int expected, final boolean isFixed){
        this.expected = expected;
        this.isFixed = isFixed;
        if(isFixed)
            this.actual = expected;
    }

    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    public boolean isFixed() {
        return isFixed;
    }
}
