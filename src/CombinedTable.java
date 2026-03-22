public class CombinedTable {

  SingleTable table1;
  SingleTable table2;

  public CombinedTable(SingleTable t1, SingleTable t2) {
    this.table1 = t1;
    this.table2 = t2;
  }

  public boolean canSeat(int number) {
    return false;
  }

  public double getDesirability() {
    return 0.0;
  }
}
