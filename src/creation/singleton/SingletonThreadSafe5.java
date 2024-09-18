package creation.singleton;

// Reflection preventive (Cannot reflectively create enum objects)
public enum SingletonThreadSafe5 {

    INSTANCE;

    SingletonThreadSafe5() {
    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
