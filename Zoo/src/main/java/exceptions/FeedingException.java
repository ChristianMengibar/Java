package exceptions;

import java.util.Objects;

public class FeedingException extends Exception {
    private String feeding;

    public FeedingException(String feeding) {
        this.feeding = feeding;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedingException that = (FeedingException) o;
        return Objects.equals(feeding, that.feeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeding);
    }

    @Override
    public String toString() {
        return "FeedingException{" +
                "feeding='" + feeding + '\'' +
                '}';
    }
}
