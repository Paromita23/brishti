import { TestBed } from '@angular/core/testing';

import { CmsmainService } from './cmsmain.service';

describe('CmsmainService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CmsmainService = TestBed.get(CmsmainService);
    expect(service).toBeTruthy();
  });
});
