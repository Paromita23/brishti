import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vendordashboard',
  templateUrl: './vendordashboard.component.html',
  styleUrls: ['./vendordashboard.component.css']
})
export class VendordashboardComponent implements OnInit {
  userName : string;
  venId : string;
  constructor() { 
    this.userName = localStorage.getItem("user");
    this.venId=localStorage.getItem("vid");
  }

  ngOnInit() {
  }

}
