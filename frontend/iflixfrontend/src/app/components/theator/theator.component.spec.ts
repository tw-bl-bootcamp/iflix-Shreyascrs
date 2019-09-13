import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TheatorComponent } from './theator.component';

describe('TheatorComponent', () => {
  let component: TheatorComponent;
  let fixture: ComponentFixture<TheatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TheatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TheatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
