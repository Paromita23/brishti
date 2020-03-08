import { Component, OnInit } from '@angular/core';
import { Agent } from '../agent';

@Component({
  selector: 'app-agent',
  templateUrl: './agent.component.html',
  styleUrls: ['./agent.component.css']
})
export class AgentComponent implements OnInit {

  constructor() { }
  FName : string;
  show(firstName) {
    this.FName = firstName;
  }
    agent = [
      new Agent(1,'Sougata','Nag','Kolkata',54415),
      new Agent(2,'Rahul','Gucchait','Kolkata',54215),
      new Agent(3,'Arjun','Singh','Mumbai',52332),
      new Agent(4,'Hariharan','Prasad','Bangalore',55421),
      new Agent(5,'Madhumitha','Selvaraj','Chennai',56487),
      new Agent(6,'Chandana','Manne','Andhra',56689),
    ]

  ngOnInit() {
  }

}
