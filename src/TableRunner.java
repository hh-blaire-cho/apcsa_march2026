public class TableRunner {

  public static void main(String[] args) {
    SingleTable singleTable1 = new SingleTable(4, 74, 60.0);
    SingleTable singleTable2 = new SingleTable(8, 74, 70.0);
    SingleTable singleTable3 = new SingleTable(12, 76, 75.0);

    CombinedTable combinedTable = new CombinedTable(singleTable1, singleTable2);
    System.out.println(combinedTable.canSeat(9)); // true
    System.out.println(combinedTable.canSeat(11)); // false
    System.out.println(combinedTable.getDesirability()); // 65.0
  }
}
