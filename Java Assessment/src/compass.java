public class compass  {

    String north;
    String east;
    String south;
    String west;

    public compass(String north, String east, String south, String west) {

        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }


    public String toString(){
        return north + east + south + west;
    }
}



