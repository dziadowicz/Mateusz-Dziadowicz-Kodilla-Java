package com.kodilla.good.patterns.challenges.airline;

public class AirConnection implements Connection {

    private final String from;
    private final String to;

    public AirConnection(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirConnection)) return false;

        AirConnection that = (AirConnection) o;

        if (!getFrom().equals(that.getFrom())) return false;
        return getTo().equals(that.getTo());
    }

    @Override
    public int hashCode() {
        int result = getFrom().hashCode();
        result = 31 * result + getTo().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AirConnection{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
