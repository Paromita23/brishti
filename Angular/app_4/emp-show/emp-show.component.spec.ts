import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpShowComponent } from './emp-show.component';

describe('EmpShowComponent', () => {
  let component: EmpShowComponent;
  let fixture: ComponentFixture<EmpShowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpShowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
