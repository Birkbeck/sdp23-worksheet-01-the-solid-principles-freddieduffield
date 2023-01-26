import java.util.List;

public class Display {
    private List<String> spots;

    public Display(List<String> spots) {
        this.spots = spots;
    }

    public void getDisplay() {
        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
                + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
                + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
