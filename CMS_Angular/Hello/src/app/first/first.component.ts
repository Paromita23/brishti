import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  company : string;
  trainee : string;
  constructor() {
    this.company="Hexaware";
    this.trainee=localStorage.getItem("trainee");
   }

  ngOnInit() {
  }

}
