package by.epam.java.kazlova.task2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(getClause(), sentence.getClause());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClause());
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "clause='" + clause + '\'' +
                '}';
    }
}

