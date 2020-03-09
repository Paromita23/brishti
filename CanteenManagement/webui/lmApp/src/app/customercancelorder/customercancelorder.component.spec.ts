import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomercancelorderComponent } from './customercancelorder.component';

describe('CustomercancelorderComponent', () => {
  let component: CustomercancelorderComponent;
  let fixture: ComponentFixture<CustomercancelorderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomercancelorderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomercancelorderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
