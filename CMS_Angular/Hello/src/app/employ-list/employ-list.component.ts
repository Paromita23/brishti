import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-list',
  templateUrl: './employ-list.component.html',
  styleUrls: ['./employ-list.component.css']
})
export class EmployListComponent implements OnInit {

  constructor() { }
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
