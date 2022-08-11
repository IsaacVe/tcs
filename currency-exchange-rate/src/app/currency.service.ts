import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { Currency } from './currency';
@Injectable({
  providedIn: 'root'
})
export class CurrencyService {

  private currencyUrl = 'http://localhost:8080/currency'

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(
    private http: HttpClient) { }
  
    getCurrencies(): Observable<Currency[]> {
      return this.http.get<Currency[]>(this.currencyUrl)
        .pipe(
          tap(_ => this.log('fetched currencies')),
          catchError(this.handleError<Currency[]>('getCurrencies', []))
        );
    }
    private handleError<T>(operation = 'operation', result?: T) {
      return (error: any): Observable<T> => {
        console.error(error); 
        this.log(`${operation} failed: ${error.message}`);
        return of(result as T);
      };
    }
  
    private log(message: string) {
      console.log(message);
    }
}
