package entities;

public class Room {
    private String holder;
    private String email;
    private int roomNumber;

    public Room(String holder, String email, int roomNumber) {
        this.holder = holder;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
