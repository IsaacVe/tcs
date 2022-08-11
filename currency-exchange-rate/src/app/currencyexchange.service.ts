import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { CurrencyExchange } from './currencyexchange';
import { MessageService } from './message.service';
@Injectable({
  providedIn: 'root'
})
export class CurrencyexchangeService {
  private currencyExchnageUrl = 'http://localhost:8080/currencyexchange/convert'
  constructor(  private http: HttpClient, private messageService: MessageService) { }

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  convertCurrency(currencyexchange: CurrencyExchange): Observable<CurrencyExchange> {

    return this.http.post<CurrencyExchange>(this.currencyExchnageUrl,currencyexchange, this.httpOptions )
    .pipe(
      tap((newCurr: CurrencyExchange) => this.log(`added currency`)),
      catchError(this.handleError<CurrencyExchange>('addCurrency'))
    );


  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      this.log(error);
      return of(result as T);
    };
  }

  private log(message: any) {
if( message.error !== undefined){
  for (let item of message.error.errors) {
    this.messageService.add(item);
  }  
}
  }
}
