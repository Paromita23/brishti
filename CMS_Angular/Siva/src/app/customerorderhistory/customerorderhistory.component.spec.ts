import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerorderhistoryComponent } from './customerorderhistory.component';

describe('CustomerorderhistoryComponent', () => {
  let component: CustomerorderhistoryComponent;
  let fixture: ComponentFixture<CustomerorderhistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerorderhistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerorderhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
