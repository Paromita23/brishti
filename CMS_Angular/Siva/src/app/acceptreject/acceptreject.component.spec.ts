import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AcceptrejectComponent } from './acceptreject.component';

describe('AcceptrejectComponent', () => {
  let component: AcceptrejectComponent;
  let fixture: ComponentFixture<AcceptrejectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AcceptrejectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AcceptrejectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
