import { TestBed } from '@angular/core/testing';

import { FreegiftService } from './freegift.service';

describe('FreegiftService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FreegiftService = TestBed.get(FreegiftService);
    expect(service).toBeTruthy();
  });
});
