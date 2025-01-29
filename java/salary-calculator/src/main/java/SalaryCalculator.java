public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
      double value = daysSkipped < 5 ? 1.0 : 0.85;
      return value;
    }

    public int bonusMultiplier(int productsSold) {
      int value = productsSold < 20 ? 10 : 13;
      return value;
    }

    public double bonusForProductsSold(int productsSold) {
      double value = bonusMultiplier(productsSold) * productsSold;
      return value;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
      double baseSalary = 1000.00;
      double salary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
      double value = salary < 2000.00 ? salary : 2000.00;
      return value;
    }
}
