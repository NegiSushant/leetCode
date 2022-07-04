//You are given an array prices where prices[i] is the price of a given stock on the ith day. 
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class SellStock 
{
  public int maxProfit(int[] prices) 
  {
    int profit = Integer.MAX_VALUE;
    int value = 0;
    int loss = 0;

    for (int i = 0; i < prices.length; i++) 
    {
      if (prices[i] < profit) 
      {
        profit = prices[i];
      }
      loss = prices[i] - profit;
      if (value < loss) 
      {
        value = loss;
      }
    }
    return value;
  }
}
