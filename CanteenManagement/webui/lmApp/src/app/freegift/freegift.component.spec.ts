import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FreegiftComponent } from './freegift.component';

describe('FreegiftComponent', () => {
  let component: FreegiftComponent;
  let fixture: ComponentFixture<FreegiftComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FreegiftComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FreegiftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
