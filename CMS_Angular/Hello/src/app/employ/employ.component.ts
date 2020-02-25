import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  constructor() { }
  empName : string;
  show(name) {
    this.empName = name;
  }
  employs = [
    new Employ(1,'Sougata','Java','Programmer',54415),
    new Employ(2,'Rahul','Angular','Programmer',54215),
    new Employ(3,'Arjun','Java','Expert',52332),
    new Employ(4,'Hariharan','Angular','Programmer',55421),
    new Employ(5,'Niharika','Angular','Expert',56487),
    new Employ(6,'Nilani','Java','Programmer',56689),
  ]
  ngOnInit() {
  }

}
