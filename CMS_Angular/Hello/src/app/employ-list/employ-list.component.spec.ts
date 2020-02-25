import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployListComponent } from './employ-list.component';

describe('EmployListComponent', () => {
  let component: EmployListComponent;
  let fixture: ComponentFixture<EmployListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
