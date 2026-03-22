public class SingleTable {

  private final int numSeats;
  private final int height;
  private double viewQuality;

  public SingleTable(int numSeats, int height, double viewQuality) {
    this.numSeats = numSeats;
    this.height = height;
    this.viewQuality = viewQuality;
  }

  public int getNumSeats() {
    return numSeats;
  }

  public int getHeight() {
    return height;
  }

  public double getViewQuality() {
    return viewQuality;
  }

  // setter method
  public void setViewQuality(double value) {
    this.viewQuality = value;
  }
}
