package exceptions;

import java.util.Objects;

public class CageDontExistsException extends Exception {
    private int cage;

    public CageDontExistsException(int cage) {
        this.cage = cage;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CageDontExistsException that = (CageDontExistsException) o;
        return cage == that.cage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cage);
    }

    @Override
    public String
    toString() {
        return "CageDontExistsException{" +
                "cage=" + cage +
                '}';
    }
}
