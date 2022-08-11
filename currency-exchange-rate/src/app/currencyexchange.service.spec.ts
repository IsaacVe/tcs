import { TestBed } from '@angular/core/testing';

import { CurrencyexchangeService } from './currencyexchange.service';

describe('CurrencyexchangeService', () => {
  let service: CurrencyexchangeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CurrencyexchangeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
