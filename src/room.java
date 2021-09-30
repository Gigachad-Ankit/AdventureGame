public class room {
    //directions to navigate room
    private String directions;

    private String north;
    private String east;
    private String south;
    private String west;

    // Constructor
    room(String name, String north, String east, String south, String west){
        this.directions = name;

        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }
}

