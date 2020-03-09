import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CmsmainComponent } from './cmsmain.component';

describe('CmsmainComponent', () => {
  let component: CmsmainComponent;
  let fixture: ComponentFixture<CmsmainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CmsmainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CmsmainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
