/**
 * The Seat class represents a single seat in a theater.
 * It stores information about the seat's name and reservation status.
 * The name of the seat.
 * The name of the person the seat is reserved for, or null if the seat is not reserved.
 */
public class Seat {
    private String name;
    private String reservedFor;
    private boolean wheelChairAccessible;

    /**
     * Constructs a Seat object with the given name.
     * @param name the name of the seat.
     */
    public Seat(String name) {
        this.name = name;
        this.reservedFor = null;
    }

    /**
     * Returns the name of the seat.
     * @return  the name of the seat.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the name of the person the seat is reserved for, or null if the seat is not reserved.
     * @return the name of the person the seat is reserved for, or null if not reserved.
     *
     */
    public String getReservedFor() {
        return reservedFor;
    }

    /**
     * Sets the name of the person the seat is reserved for.
     * @param reservedFor reservedFor the name of the person the seat is reserved for.
     */
    public void setReservedFor(String reservedFor) {
        if (this.reservedFor != null) throw new IllegalCallerException("Cannot set already reserved seat!");
        this.reservedFor = reservedFor;
    }

    /**
     * Checks if the seat is reserved.
     * @return true if the seat is reserved, false otherwise
     */
    public boolean isReserved() {
        return reservedFor != null;
    }

    public void setWheelChairAccessible(boolean wheelChairAccessible) {
        this.wheelChairAccessible = wheelChairAccessible;
    }

    @Override
    public String toString() {
        if (this.isReserved()) return "X";
        if (this.wheelChairAccessible) return "=";
        return "_";
    }
}
