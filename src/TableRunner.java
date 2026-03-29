public class TableRunner {

  public static void main(String[] args) {
    SingleTable singleTable1 = new SingleTable(4, 74, 60.0);
    SingleTable singleTable2 = new SingleTable(8, 74, 70.0);
    SingleTable singleTable3 = new SingleTable(12, 76, 75.0);

    CombinedTable combinedTable1 = new CombinedTable(singleTable1, singleTable2);
    System.out.println(combinedTable1.canSeat(9)); // true
    System.out.println(combinedTable1.canSeat(11)); // false
    System.out.println(combinedTable1.getDesirability()); // 65.0

    CombinedTable combinedTable2 = new CombinedTable(singleTable2, singleTable3);
    System.out.println(combinedTable2.canSeat(18));
    System.out.println(combinedTable2.getDesirability());
    singleTable2.setViewQuality(80);
    System.out.println(combinedTable2.getDesirability());


  }
}
