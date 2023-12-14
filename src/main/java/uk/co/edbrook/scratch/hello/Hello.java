package uk.co.edbrook.scratch.hello;

public class Hello {

    private Long id;

    private String name;

    private int lower;

    private int upper;

    public Hello() {
    }

    public Hello(Long id, String name, int lower, int upper) {
        this.id = id;
        this.name = name;
        this.lower = lower;
        this.upper = upper;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }
}
