package by.epam.java.kazlova.task2;

public class Sentence {
    private String clause;

    public Sentence(String clause) {
        this.clause = clause;
    }
    public Sentence() {
        this.clause = " ";
    }

    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }
}
