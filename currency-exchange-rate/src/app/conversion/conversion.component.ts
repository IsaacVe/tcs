import { Component, OnInit } from '@angular/core';
import { CurrencyService } from '../currency.service';
import { CurrencyexchangeService } from '../currencyexchange.service';
import { Currency } from '../currency';
import { CurrencyExchange } from '../currencyexchange';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-conversion',
  templateUrl: './conversion.component.html',
  styleUrls: ['./conversion.component.css']
})
export class ConversionComponent implements OnInit {
 
  currencyExchange = {} as CurrencyExchange;
  currencies: Currency[] = [];
  messages: string[] = [];
  
  constructor(private currencyService: CurrencyService,private currencyexchangeService: CurrencyexchangeService, public messageService: MessageService) { }

  ngOnInit(): void {
    this.getCurrencies();
  }
  

  getCurrencies() :  void{
    this.currencyService.getCurrencies().
    subscribe(currencies =>{ this.currencies = currencies; console.log(currencies)})
  }

  onSubmit(): void {
    this.currencyexchangeService.convertCurrency(this.currencyExchange)
    .subscribe( currency => this.currencyExchange =  currency );

  }

  

}
