import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customerdashboard',
  templateUrl: './customerdashboard.component.html',
  styleUrls: ['./customerdashboard.component.css']
})
export class CustomerdashboardComponent implements OnInit {

  userName : string;
  cusId : string;

  constructor() {
    this.userName = localStorage.getItem("user");
    this.cusId=localStorage.getItem("cid");
   }

  ngOnInit() {
  }

}
