public class map {
  private String currentRoom;


  map(){
    room r1 = new room("Room 1",null, "east", "south", null);
    room r2 = new room("Room 2",null, "east", null,  "west");
    room r3 = new room("Room 3",null, null, "south", "west");
    room r4 = new room("Room 4","north", null, "south", null);
    room r5 = new room("Room 5",null, null, "south", null);
    room r6 = new room("Room 6","north", null, "south", null);
    room r7 = new room("Room 7","north", "east", null, null);
    room r8 = new room("Room 8","north", "east", null, "west");
    room r9 = new room("Room 9","north", null, null, "west");
  }

}
