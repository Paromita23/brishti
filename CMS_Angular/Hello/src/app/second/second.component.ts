import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  name : string;
  age : number;
  college : string;
  trainee : string;
  constructor() {
    this.name="Paromita Saha"; 
    this.age=21;
    this.college="Guru Nanak Institute of Technology";
    this.trainee=localStorage.getItem("trainee");
  }

  ngOnInit() {
  }

}
