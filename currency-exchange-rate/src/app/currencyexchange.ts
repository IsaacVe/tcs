export interface CurrencyExchange {
    from: string;
    to: string;
    currencyRate: number;
    amount: number;
    totalCalculatedAmount: number;
  }