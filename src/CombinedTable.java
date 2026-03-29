public class CombinedTable {

  SingleTable table1;
  SingleTable table2;

  public CombinedTable(SingleTable t1, SingleTable t2) {
    this.table1 = t1;
    this.table2 = t2;
  }

  public boolean canSeat(int number) {
    return table1.getNumSeats() + table2.getNumSeats() - 2 >= number;
  }

  public double getDesirability() {
    if (table1.getHeight() == table2.getHeight()) {
      return (table1.getViewQuality() + table2.getViewQuality()) / 2;
    }
    return (table1.getViewQuality() + table2.getViewQuality()) / 2 - 10;
  }
}
